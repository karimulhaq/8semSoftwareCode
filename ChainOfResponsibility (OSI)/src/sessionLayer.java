public class sessionLayer implements Chaining {
    private Chaining nextInChain;
    @Override
    public void setNextChain(Chaining nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void process(Data request) {

        if (request.getData() != null){
            // Do what the session layer does (controls the dialogues and set the connections)
            request.appendData("+sessionLayerData");
            nextInChain.process(request);
        }
        else {
            nextInChain.process(request);
        }
    }
}
