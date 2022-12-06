public class physicalLayer implements Chaining {
    private Chaining nextInChain;
    @Override
    public void setNextChain(Chaining nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void process(Data request) {

        if (request.getData() != null){
            //  physical data is added
            request.appendData("+bits");
            System.out.println(request.getData());

        }
        else {
            nextInChain.process(request);
        }
    }
}
