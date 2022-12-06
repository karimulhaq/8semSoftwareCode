public class dataLinkLayer implements Chaining {
    private Chaining nextInChain;
    @Override
    public void setNextChain(Chaining nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void process(Data request) {

        if (request.getData() != null){
            // DataLinkLayer data is added
            request.appendData("+frame");
            nextInChain.process(request);
        }
        else {
            nextInChain.process(request);
        }
    }
}
