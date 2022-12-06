public class presentationLayer implements Chaining {
    private Chaining nextInChain;
    @Override
    public void setNextChain(Chaining nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void process(Data request) {

        if (request.getData() != null){
            // Do what the presentation layer does (encryption, translation)
            request.appendData("+presentationLayerData");
            nextInChain.process(request);
        }
        else {
            nextInChain.process(request);
        }
    }
}
