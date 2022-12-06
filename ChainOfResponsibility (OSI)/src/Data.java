public class Data {
//    private String data;
    public static String data;
    public Data(String data){
        this.data = data;
    }
//    public static String getData() {
//        return data;
//    }
    public String getData() {
        return data;
    }
    public void appendData(String data){
        this.data = this.data + data;
//          this.data = this.data;
    }
}
