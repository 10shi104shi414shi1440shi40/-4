import java.util.Scanner;
public class jiemian1 {
    jiemian1(int A,boolean D){
        System.out.println("请您选择1.查询学费。2.查询薪水。3.缴纳学费。4.发放学费");
        Scanner xuanxiang1 = new Scanner(System.in);
        while (D) {
            A = xuanxiang1.nextInt();
            Inputxuanze1 inputxuanze1 = new Inputxuanze1();
            try {
                inputxuanze1.inputxuanze1(A);
                D = inputxuanze1.D;
            } catch (Yichang6 e) {
                System.out.println(e.warn());
            }
        }
    }
}
