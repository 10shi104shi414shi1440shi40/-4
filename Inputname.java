public class Inputname {
    boolean D;
    public void inputname(String A) throws Yichang1 {
        for (int i = 0; i < A.length(); i++) {
            if (Character.isDigit(A.charAt(i))) {     //用char包装类中的判断数字的方法判断每一个字符
                D = true;
                throw new Yichang1();
            }
            else{
                D=false;
            }
        }
    }
}
