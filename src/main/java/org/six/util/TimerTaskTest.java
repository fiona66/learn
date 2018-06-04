//package org.six.util;
//
//import java.io.IOException;
//import java.text.ParseException;
//import java.util.Date;
//import java.util.TimerTask;
//
//
//public class TimerTaskTest extends TimerTask {
//
//    private int afterToday = 0;
//
//    public  TimerTaskTest(int dayCount){
//        this.afterToday = dayCount;
//    }
//
//    @Override
//    public void run() {
//        JDBCDemo task1 = new JDBCDemo();
//        try {
//            task1.query(afterToday);
//            Date date = new Date(this.scheduledExecutionTime());
//            System.out.println("当前时间为："+date);
//            SendEmailDemo sendEmailDemo = new SendEmailDemo();
//            sendEmailDemo.timingSendEmail(afterToday);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//
//}
//
