import java.util.InputMismatchException;
import java.util.Scanner;

public class Text {
    public static void main (String args[]) {
        String read2 = null;
        String read3 = null;
        String read4 = null;
        String read5 = null;
        String read6 = null;
        int xuanze1 = 0;
        int xuanze11 = 0;
        boolean D1 = true;
        boolean D2 = true;
        boolean D3 = true;
        boolean D4 = true;
        boolean D5 = true;
        boolean D6 = true;
        boolean D61 = true;
        final double x = 0.03;
        final double b = 0.1;
        final double c = 0.2;
        final double d = 0.25;
        final double z = 0.3;
        final double f = 0.35;
        final double g = 0.45;

        System.out.println("请输入姓名：");
        Scanner scan2 = new Scanner(System.in);
        while(D1) {
            read2 = scan2.next();
            Inputname inputname = new Inputname();
            try {
                inputname.inputname(read2);
                D1 = inputname.D;
            }
            catch (Yichang1 e) {
                System.out.println(e.warn());
            }
        }


        System.out.println("请输入性别：");
        Scanner scan3 = new Scanner(System.in);
        while(D2) {
            read3 = scan3.next();
            Inputxingbie inputxingbie = new Inputxingbie();
            try {
                inputxingbie.inputxingbie(read3);
                D2 = inputxingbie.D;
            }
            catch (Yichang2 e) {
                System.out.println(e.warn());
            }
        }

        System.out.println("请输入年龄：");
        Scanner scan4 = new Scanner(System.in);
        while(D3) {
            read4 = scan4.next();
            Inputage inputage = new Inputage();
            try {
                inputage.inputage(read4);
                D3 = inputage.D;
            }
            catch (Yichang3 e) {
                System.out.println(e.warn());
            }
        }

        Studentdoctor a = new Studentdoctor();
        a.name = read2;
        a.xingbie = read3;
        a.age = read4;
        System.out.println(a.gerenxinxi());



        //System.out.println("请您选择1.查询学费。2.查询薪水。3.缴纳学费。4.发放学费");
        //Scanner xuanxiang1 = new Scanner(System.in);
        //while (D6) {
        //    xuanze1 = xuanxiang1.nextInt();
        //    Inputxuanze1 inputxuanze1 = new Inputxuanze1();
        //    try {
        //        inputxuanze1.inputxuanze1(xuanze1);
        //        D6 = inputxuanze1.D;
        //    } catch (Yichang6 e) {
        //        System.out.println(e.warn());
        //    }
        //}


        //if (xuanze1 == 1){
            System.out.println("请选择您的专业1.计算机。2.B。3.C");
            Scanner xuanxiang11 = new Scanner(System.in);
            while(D61){
                xuanze11 = xuanxiang11.nextInt();
                Inputxuanze11 inputxuanze11 = new Inputxuanze11();
                try {
                    inputxuanze11.inputxuanze11(xuanze11);
                    D61 = inputxuanze11.D;
                }
                catch(Yichang61 e){
                    System.out.println(e.warn());
                }
            }
            System.out.println(a.chaxunxuefei(xuanze11));
            System.out.println(a.chaxunxinshui());
        //}
        System.out.println("即将为您计算您的年收入。。请稍后");
        System.out.println("·");
        System.out.println("·");
        System.out.println("·");
        System.out.println("·");
        System.out.println("请输入月薪：");
        Scanner scan6 = new Scanner(System.in);
        while(D5) {
            read6 = scan6.next();
            Inputyuexin inputyuexin = new Inputyuexin();
            try {
                inputyuexin.inputyuexin(read6);
                D5 = inputyuexin.D;
            }
            catch (Yichang5 e) {
                System.out.println(e.warn());
            }
        }
        int num = Integer.parseInt(read6);
        a.monthxinshui = num;
        if(a.monthxinshui*12 - a.yearxuefei*2 > 0 && a.monthxinshui*12 - a.yearxuefei*2 <= 5000) {
            a.shuishou = 0;
        }else if(a.monthxinshui*12 - a.yearxuefei*2 > 5000 && a.monthxinshui*12 - a.yearxuefei*2 <= 8000) {
            a.shuishou =x*(a.monthxinshui*12 - a.yearxuefei*2 - 5000);
        }else if(a.monthxinshui*12 - a.yearxuefei*2 > 8000 && a.monthxinshui*12 - a.yearxuefei*2 <= 17000) {
            a.shuishou =90 + b*(a.monthxinshui*12 - a.yearxuefei*2 - 8000);
        }else if(a.monthxinshui*12 - a.yearxuefei*2 > 17000 && a.monthxinshui*12 - a.yearxuefei*2 <= 30000) {
            a.shuishou =90 + 900 + c*(a.monthxinshui*12 - a.yearxuefei*2 - 17000);
        }else if(a.monthxinshui*12 - a.monthxinshui*12 > 30000 && a.monthxinshui*12 - a.yearxuefei*2 <= 40000) {
            a.shuishou =90 + 900 + 2600 + d*(a.monthxinshui*12 - a.yearxuefei*2 - 30000);
        }else if(a.monthxinshui*12 - a.yearxuefei*2 > 40000 && a.monthxinshui*12 - a.yearxuefei*2 <= 60000) {
            a.shuishou =90 + 900 + 2600 + 2500 + z*(a.monthxinshui*12 - a.yearxuefei*2 - 40000);
        }else if(a.monthxinshui*12 - a.yearxuefei*2 > 60000 && a.monthxinshui*12 - a.yearxuefei*2 <= 85000) {
            a.shuishou =90 + 900 + 2600 + 2500 + 6000 + f*(a.monthxinshui*12 - a.yearxuefei*2 - 60000);
        }else if(a.monthxinshui*12 - a.yearxuefei*2 > 85000) {
            a.shuishou =90 + 900 + 2600 + 2500 + 6000 + 8750 + g*(a.monthxinshui*12 - a.yearxuefei*2 - 60000);
        }else {
            System.out.println("当薪水低于学费时，您不用缴纳税款！");
        }
        a.nianshouru = a.monthxinshui*12-a.shuishou;
        System.out.println("您的年收入为："+a.nianshouru);

        //System.out.println("");
        //Scanner scan5 = new Scanner(System.in);
        //while(D4) {
         //   read5 = scan5.next();
           // Intputxuefei inputxuefei = new Intputxuefei();
            //try {
              //  inputxuefei.inputxuefei(read5);
               // D4 = inputxuefei.D;
            //}
            //catch (Yichang4 e) {
              //  System.out.println(e.warn());
            //}
        //}


    }
}

