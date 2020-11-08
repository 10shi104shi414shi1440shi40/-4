public class Yichang6 extends  Exception{
    String message;
    public Yichang6(){
        message = "请输入1-4的整数进行选择";
    }
    public String warn(){
        return message;
    }
}
