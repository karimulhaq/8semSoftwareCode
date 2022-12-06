public class applicationLayer implements Chaining {
    private Chaining nextInChain;
    @Override
    public void setNextChain(Chaining nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void process(Data request) {

        if (request.getData() != null){
            // application layer data is added
            request.appendData("+applayerData");
//            System.out.println(Data.getData());
            nextInChain.process(request);
        }
        else {
            nextInChain.process(request);
        }
    }
}
