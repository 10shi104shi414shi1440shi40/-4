public class Yichang4 extends Exception {
    String message;
    public Yichang4(){
        message = "学费请输入整数或带两位小数的正数";
    }
    public String warn(){
        return message;
    }
}

