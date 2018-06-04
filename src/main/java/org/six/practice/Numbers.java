package org.six.practice;

/**
 * Created by yanglu on 3/23/17.
 */
public class Numbers {
    public static void main(String args[]){

//        // 使用Integer(包装类,Number的子类)对象的实例
//        Integer x = 5;
//        x =  x + 10;
//        System.out.println(x);
//        // 当 x 被赋为整型值时，由于x是一个对象，所以编译器要对x进行装箱。然后，为了使x能进行加运算，所以要对x进行拆箱。

//        // Math类
//        System.out.println("90 度的正弦值：" + Math.sin(Math.PI/2));
//        System.out.println("0度的余弦值：" + Math.cos(0));
//        System.out.println("60度的正切值：" + Math.tan(Math.PI/3));
//        System.out.println("1的反正切值： " + Math.atan(1));
//        System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI/2));
//        System.out.println(Math.PI);

//        //转义
//        System.out.println("访问\"菜鸟教程!\"");

//        // string类
//        char[] helloArray = { 'r', 'u', 'n', 'o', 'o', 'b'};
//        String helloString = new String(helloArray);
//        System.out.println( helloString );

//        String site = "www.duitang.com";
//        int len = site.length();
//        System.out.println( "堆糖网址长度 : " + len );


//        // 链接字符串
//        String string1 = "堆糖网址：";
//        System.out.println("1、" + string1 + "www.duitang.com");

//        // 格式化字符串
//        System.out.printf("浮点型变量的的值为 " +
//                "%f, 整型变量的值为 " +
//                " %d, 字符串变量的值为 " +
//                "is %s", floatVar, intVar, stringVar);

        StringBuffer sBuffer = new StringBuffer("菜鸟教程官网：");
        sBuffer.append("www");
        sBuffer.append(".runoob");
        sBuffer.append(".com");
        System.out.println(sBuffer);


    }

}
