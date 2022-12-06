public class transportLayer implements Chaining {
    private Chaining nextInChain;
    @Override
    public void setNextChain(Chaining nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void process(Data request) {

        if (request.getData() != null){
            // TransportLayer data is added
            request.appendData("+segment");
            nextInChain.process(request);
        }
        else {
            nextInChain.process(request);
        }
    }
}
