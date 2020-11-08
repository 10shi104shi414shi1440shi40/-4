public class Inputxingbie extends Yichang2{
    boolean D;
    String B = "男";
    String C = "女";
    public void inputxingbie(String A) throws Yichang2 {
        if (A.equals(B)==false && A.equals(C)==false){
            D = true;
            throw new Yichang2();
        }
        else {
            D = false;
        }
    }
}

