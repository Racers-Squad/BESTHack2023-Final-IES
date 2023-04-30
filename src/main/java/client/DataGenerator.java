package client;

import com.github.javafaker.Faker;
import com.racerssquad.besthack2023.DTO.proto.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class DataGenerator {

    private final int mode;
    private final String name;
    private final int timeout;
    Faker faker = new Faker();

    private List<OwnCommand> commands = new ArrayList<>();
    private List<List<String>> sendValues = new ArrayList<>();
    private List<Integer> numberOfRows = new ArrayList<>();
    private List<String> captions = new ArrayList<>();

    public DataGenerator(int mode, String name, int timeout) {
        this.mode = mode;
        this.name = name;
        this.timeout = timeout;

        if (mode == 2) {
            generateMethods();
        }
    }

    private void generateMethods() {
        int count = ThreadLocalRandom.current().nextInt(1, 5);
        for (int i = 0; i < count; ++i) {
            int paramCount = ThreadLocalRandom.current().nextInt(1, 4);
            List<Parameter> params = new ArrayList<>(paramCount);
            for (int j = 0; j < paramCount; ++j) {
                params.add(Parameter.newBuilder()
                        .setAlias(faker.name().name())
                        .setCaption(faker.name().name())
                        .setHint(faker.space().company())
                        .setValue(ValueRef.newBuilder()
                                .setDataTypeValue(ThreadLocalRandom.current().nextInt(0, 4))
                                .setFormat(faker.hipster().word())
                                .setValue(faker.esports().event())
                                .build())
                        .build());
            }

            int retValCount = ThreadLocalRandom.current().nextInt(1, 6);
            ArrayList<String> fields = new ArrayList<>();
            for (int j = 0; j < retValCount; ++j) {
                fields.add(faker.commerce().productName());
            }
            sendValues.add(fields);

            int nRows = ThreadLocalRandom.current().nextInt(1, 5);
            numberOfRows.add(nRows);

            captions.add(faker.chuckNorris().fact());

            commands.add(OwnCommand.newBuilder()
                    .setAlias(faker.rickAndMorty().character())
                    .setCaption(faker.name().lastName())
                    .setDescription(faker.rickAndMorty().quote())
                    .build());
        }
    }

    public String generateMessageNum(){
        return UUID.randomUUID().toString();
    }

    public ExchangeInfoMessage getHandShakeRequest() {
        return ExchangeInfoMessage.newBuilder()
                .setHeader(Header.newBuilder()
                        .setMessageNum(UUID.randomUUID().toString())
                        .setSender(name)
                        .setReceiver("TCP-Server")
                        .setTimestamp(new Date().getTime()))
                .setRequest(Request.newBuilder()
                        .setCommand(MessageEnumsProto.CommandType.ctHandshake)
                        .addAllSupportedCommands(commands)
                        .build())
                .build();
    }

    public ExchangeInfoMessage generateResponse(ExchangeInfoMessage request) {
        ExchangeInfoMessage msg;

        Header header = Header.newBuilder()
                .setSender(name)
                .setReceiver(request.getHeader().getSender())
                .setTimestamp(new Date().getTime())
                .setMessageNumAnswer(request.getHeader().getMessageNum())
                .setMessageNum(UUID.randomUUID().toString())
                .build();

        if (request.getRequest().getCommand() == MessageEnumsProto.CommandType.ctStatus) {
            Response response = Response.newBuilder()
                    .setCommand(MessageEnumsProto.CommandType.ctStatus)
                    .setStatus(Status.newBuilder())
                    .setAnswerType(MessageEnumsProto.AnswerType.atAnswerOK)
                    .setStatus(Status.newBuilder()
                            .setType(MessageEnumsProto.StatusType.stReady)
                            .build())
                    .build();

            msg = ExchangeInfoMessage.newBuilder()
                    .setResponse(response)
                    .setHeader(header)
                    .build();

        } else if (request.getRequest().getCommand() == MessageEnumsProto.CommandType.ctExecCommand) {
            int id = getIdByAlias(request);
            msg = ExchangeInfoMessage.newBuilder()
                    .setResponse(generate(id))
                    .setHeader(header)
                    .build();
        } else {
            msg = ExchangeInfoMessage.newBuilder()
                    .setHeader(header)
                    .setResponse(Response.newBuilder()
                            .setCommand(request.getRequest().getCommand())
                            .setAnswerType(MessageEnumsProto.AnswerType.UNRECOGNIZED)
                            .build())
                    .build();
        }

        return msg;
    }

    public int getIdByAlias(ExchangeInfoMessage request){
        for (int i = 0; i < commands.size(); ++i) {
            if (commands.get(i).getAlias().equals(request.getRequest().getCommandForExec().getAlias())) {
                return i;
            }
        }
        return -1;
    }

    public Response generate(int id) {
        if (id < 0) {
            throw new IllegalArgumentException("Alies dor command couldn't be found");
        }
        List<AdvInfoFieldRef> refs = sendValues.get(id).stream()
                .map(it -> AdvInfoFieldRef.newBuilder()
                                .setDataType(MessageEnumsProto.DataType.dtString)
                                .setAlias(it)
                                .setCaption(it)
                                .build())
                .toList();

        List<DataRow> rows = new ArrayList<>();
        for (int i = 0; i < numberOfRows.get(id); ++i) {
            List<DataFieldValue> values = refs.stream()
                    .map(it -> DataFieldValue.newBuilder()
                                    .setAlias(it.getAlias())
                                    .setValue(ValueRef.newBuilder()
                                            .setDataType(MessageEnumsProto.DataType.dtString)
                                            .setFormat("%s")
                                            .setValue(faker.cat().name())
                                            .build())
                                    .build())
                    .toList();

            rows.add(DataRow.newBuilder()
                    .setRowIdent(String.valueOf(i))
                    .setIncrementDelete(false)
                    .addAllValues(values)
                    .build());
        }

        AdvInfoData data = AdvInfoData.newBuilder()
                .setFullOrIncrement(true)
                .addAllRows(rows)
                .build();

        AdvInfo advInfo = AdvInfo.newBuilder()
                .setCaption(captions.get(id))
                .addAllFields(refs)
                .setData(data)
                .build();

        Status status = Status.newBuilder()
                .setType(MessageEnumsProto.StatusType.stPerformed)
                .setDetails(faker.lebowski().quote())
                .setNextTime(new Date().getTime() + this.timeout * 1000L)
                .setAdvStatus(advInfo)
                .build();

        return Response.newBuilder()
                .setStatus(status)
                .setAnswerType(MessageEnumsProto.AnswerType.atAnswerOK)
                .setCommand(MessageEnumsProto.CommandType.ctExecCommand)
                .build();
    }

    public int getMode() {
        return mode;
    }

    static class SendValues {
        protected String name;
    }

}
