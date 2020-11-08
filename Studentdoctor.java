import java.util.Scanner;

public class Studentdoctor implements Student,Teacher {
    String name;
    String xingbie;
    String age;
    double yearxuefei;
    double monthxinshui = 5000.00;
    double nianshouru;
    double shuishou;
    String A,B,C;
    //Studentdoctor (String name,String xingbie,int age,double yearxuefei,double monthxinshui){
      //  this.name = name;
       // this.xingbie = xingbie;
        //this.age = age;
        //this.yearxuefei = yearxuefei;
        //this.monthxinshui = monthxinshui;
        //A = "姓名："+name+" 性别："+xingbie+" 年龄："+age;
    //}
    public String chaxunxuefei(int zhuanye){
        int zhuanye1 = 1;
        int zhuanye2 = 2;
        int zhuanye3 = 3;
        if(zhuanye == zhuanye1){
             yearxuefei = 5000.00;
        }
        if(zhuanye == zhuanye2){
            yearxuefei =10000.00;
        }
        if(zhuanye == zhuanye3){
            yearxuefei = 99999.00;
        }
        return "您的学费为："+yearxuefei;
    }

    public String chaxunxinshui(){
        C = "您的月薪水为："+monthxinshui+"\n";
        return C;
    }

    public void jiaonaxuefei(){
        System.out.println("学费缴纳成功");
    }
    public void fafangxinshui(){
        System.out.println("工资已发放");
    }

    public String gerenxinxi(){
        return "您的个人信息：姓名："+name+" 性别："+xingbie+" 年龄："+age;
    }
}
