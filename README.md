# -4
## 实验4

## 实验目的

掌握Java中抽象类和抽象方法的定义； 
掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法
了解异常的使用方法，并在程序中根据输入情况做异常处理

## 实验内容

某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。
1.设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。
2.设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。（其他属性及方法，可自行发挥）
3.编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额（国家最新工资纳税标准，请自行检索）。

## 核心代码：
···
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
···
public class Yichang1 extends Exception {
    String message;
    public Yichang1(){
        message = "请输入请问字母或汉字。";
    }
    public String warn(){
        return message;
    }
}
···
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
···
使用while循环设置循环输入并用自定义异常来限制输入内容类型。

## 实验结果

