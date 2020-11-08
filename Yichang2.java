public class Yichang2 extends Exception {
    String message;
    public Yichang2(){
        message = "请输入汉字“男”或“女”选择性别。";
    }
    public String warn(){
        return message;
    }
}