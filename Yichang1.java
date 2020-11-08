public class Yichang1 extends Exception {
    String message;
    public Yichang1(){
        message = "请输入请问字母或汉字。";
    }
    public String warn(){
        return message;
    }
}
