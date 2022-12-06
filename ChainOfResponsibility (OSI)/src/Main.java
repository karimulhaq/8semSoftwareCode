public class Main {
    public static void main(String[] args) {
        Chaining appObj = new applicationLayer();
        Chaining presentationObj = new presentationLayer();
        Chaining sessionObj = new sessionLayer();
        Chaining transportObj = new transportLayer();
        Chaining networkObj = new networkLayer();
        Chaining datalinkObj = new dataLinkLayer();
        Chaining physicalObj = new physicalLayer();
// chain of objects and calling
        appObj.setNextChain(presentationObj);
        presentationObj.setNextChain(sessionObj);
        sessionObj.setNextChain(transportObj);
        transportObj.setNextChain(networkObj);
        networkObj.setNextChain(datalinkObj);
        datalinkObj.setNextChain(physicalObj);

        Data request = new Data("data");
        appObj.process(request);
    }
}