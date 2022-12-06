public interface Chaining {
    public void setNextChain(Chaining nextChain);
    public void process(Data request);
}
