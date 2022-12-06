public class networkLayer implements Chaining {
    private Chaining nextInChain;
    @Override
    public void setNextChain(Chaining nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void process(Data request) {

        if (request.getData() != null){
            // NetworkLayer data is added
            request.appendData("+packet");
            nextInChain.process(request);
        }
        else {
            nextInChain.process(request);
        }
    }
}
