package org.six.util;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Properties;

/**
 * Created by yanglu on 5/9/17.
 */
public class SendEmailDemo {
    public void SendEmail(int afterToday)
    {
        // 收件人电子邮箱
//        String to = "ylfiona66@gmail.com";
//        String to = "waterdkx@gmail.com";
//        String[] to={"waterdkx@gmail.com","ylfiona66@gmail.com"};
        String[] to = {"ylfiona66@gmail.com"};

        // 发件人电子邮箱
        String from = "lulu_fiona@163.com";

        // 指定发送邮件的主机为 smtp.163.com
        String host = "smtp.163.com";  //163 邮件服务器

        // 获取系统属性
        Properties properties = System.getProperties();

        // 设置邮件服务器
        properties.setProperty("mail.smtp.host", host);

        properties.put("mail.smtp.auth", "true");
        // 获取默认session对象
        Session session = Session.getDefaultInstance(properties,new Authenticator(){
            public PasswordAuthentication getPasswordAuthentication()
            {
                return new PasswordAuthentication("lulu_fiona@163.com", "5200510"); //发件人邮件用户名、密码
            }
        });

        try{
            // 创建默认的 MimeMessage 对象
            MimeMessage message = new MimeMessage(session);

            // Set From: 头部头字段
            message.setFrom(new InternetAddress(from));

            // Set To: 头部头字段
            for (String receiver : to) {
                message.addRecipient(Message.RecipientType.TO,
                        new InternetAddress(receiver));
            }

            // Set 动态变化的主题&正文信息
            FlightDemo getminprice=new FlightDemo();
            String departureTime = getminprice.getDepartureTime(afterToday);

            // Set Subject: 头部头字段
            message.setSubject("66发送的"+departureTime+"春秋航空沙巴--上海最低价格信息");

            // 设置消息体
            JDBCDemo jdbcDemo = new JDBCDemo();
            List<FlightEveryDayMinPrice> flightEveryDayMinPriceList= null;
            try {
                flightEveryDayMinPriceList = jdbcDemo.query("select * from flightminprice where departure_date between '2017-06-12' and '2017-06-30' ;");
                message.setText(String.valueOf(flightEveryDayMinPriceList));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            }
            System.out.println(flightEveryDayMinPriceList);

//            try {
//                int minprice=getminprice.getMinPrice(afterToday);
////                message.setText("Hello ~\n"+departureTime+"沙巴--上海春秋航空最低机票价格为:"+minprice);
//            } catch (ParseException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }

            // 发送消息
            Transport.send(message);
            System.out.println("Sent message successfully....");
        }catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }

}

