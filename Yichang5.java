public class Yichang5 extends Exception {
    String message;
    public Yichang5(){
        message = "月薪请输入整数或带两位小数的正数";
       }
       public String warn(){
        return message;
    }
}
