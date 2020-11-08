public class Intputxuefei {
    boolean D;
    public void inputxuefei(String A) throws Yichang4{
        if (A.matches("^^[0-9]+(.[0-9]{2})?$")) {
            D = false;
        }
        else {
            D = true;
            throw new Yichang4();
        }
    }
}
