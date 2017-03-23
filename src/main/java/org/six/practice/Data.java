package org.six.practice;
import java.util.Date;
import java.util.*;
import java.text.*;

/**
 * Created by yanglu on 3/23/17.
 */
public class Data {
    public static void main(String args[]) {

//        // 案例1:输出当前时间
//        // 初始化 Date 对象
//        Date date = new Date();
//        // 使用 toString() 函数显示当前日期时间
//        System.out.println(date.toString());
//        // 输出结果格式为"Thu Mar 23 17:40:18 CST 2017"


//        // 案例2:格式化日期,输出当前时间格式为"Current Date: Thu 2017.03.23 at 05:42:31 PM CST"
//        Date dNow = new Date( );
//        SimpleDateFormat ft =
//                new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
//
//        System.out.println("Current Date: " + ft.format(dNow));


//        // 案例3:使用printf格式化日期,输出当前时间格式为"Current Date/Time : Thu Mar 23 17:45:04 CST 2017"
//        // 初始化 Date 对象
//        Date date = new Date();
//        // 使用toString()显示日期和时间
//        String str = String.format("Current Date/Time : %tc", date );
//        System.out.printf(str);



//        // 案例4:重复提供日期,利用格式化字符串支出要被格式化的参数的索引, 输出时间格式为"Due date: March 23, 2017"
//        // 初始化 Date 对象
//        Date date = new Date();
//        // 使用toString()显示日期和时间
//        System.out.printf("%1$s %2$tB %2$td, %2$tY",
//                "Due date:", date);


//        // 案例5:重复提供日期,用<标识,表明先前被格式化的参数要被再次使用,输出时间格式为"Due date: March 23, 2017"
//        // 初始化 Date 对象
//        Date date = new Date();
//        // 显示格式化时间
//        System.out.printf("%s %tB %<te, %<tY",
//                "Due date:", date);


//        // 案例6:解析字符串为时间,输出结果为"2017-03-23 Parses as Thu Mar 23 00:00:00 CST 2017"
//        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
//        String input = args.length == 0 ? "2017-03-23" : args[0];
//        System.out.print(input + " Parses as ");
//        Date t;
//        try {
//            t = ft.parse(input);
//            System.out.println(t);
//        } catch (ParseException e) {
//            System.out.println("Unparseable using " + ft);
//        }


//        // 案例7: sleep,输出结果为"Thu Mar 23 17:57:45 CST 2017 Thu Mar 23 17:57:48 CST 2017"
//        try {
//            System.out.println(new Date( ) + "\n");
//            Thread.sleep(1000*3);   // 休眠3秒
//            System.out.println(new Date( ) + "\n");
//        } catch (Exception e) {
//            System.out.println("Got an exception!");
//        }


        // 案例8:测量时间间隔(单位:毫秒)
        // 输出结果为"Thu Mar 23 17:59:01 CST 2017  Thu Mar 23 17:59:04 CST 2017  Difference is : 3068"
        try {
            long start = System.currentTimeMillis( );
            System.out.println(new Date( ) + "\n");
            Thread.sleep(5*60*10);
            System.out.println(new Date( ) + "\n");
            long end = System.currentTimeMillis( );
            long diff = end - start;
            System.out.println("Difference is : " + diff);
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }


    }
}
