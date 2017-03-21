package org.six.practice;

/**
 * Created by yanglu on 3/21/17.
 */

public class BianLiang {
//    // 局部变量
//    public void pupAge(){
//        int age = 0;
//        age = age +7;
//        System.out.println("小狗的年龄是:" + age);
//    }
//
//    public  static  void main(String args[]){
//        BianLiang jbbLiang = new BianLiang();
//        jbbLiang.pupAge();
//    }

//    // 实例变量
//    // 这个实例变量对子类可见
//    public String name;
//    // 私有变量，仅在该类可见
//    private double salary;
//    //在构造器中对name赋值
//    public BianLiang (String empName){
//        name = empName;
//    }
//    //设定salary的值
//    public void setSalary(double empSal){
//        salary = empSal;
//    }
//    // 打印信息
//    public void printEmp(){
//        System.out.println("名字 : " + name );
//        System.out.println("薪水 : " + salary);
//    }
//
//    public static void main(String args[]){
//        BianLiang empOne = new BianLiang("RUNOOB");
//        empOne.setSalary(1000);
//        empOne.printEmp();
//    }

    // 类变量
    //salary是静态的私有变量
    private static double salary;
    // DEPARTMENT是一个常量
    public static final String DEPARTMENT = "开发人员";
    public static void main(String args[]){
        salary = 10000;
        System.out.println(DEPARTMENT+"平均工资:"+salary);
    }
}
