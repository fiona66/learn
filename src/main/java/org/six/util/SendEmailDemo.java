package org.six.util;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * Created by yanglu on 5/9/17.
 */
public class SendEmailDemo {
    public static void main(String [] args)
    {
        // 收件人电子邮箱
        String to = "waterdkx@gmail.com";

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
            message.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(to));

            // Set Subject: 头部头字段
            message.setSubject("66发送的邮件主题");

            // 设置消息体
            message.setText("This is actual message");

            // 发送消息
            Transport.send(message);
            System.out.println("Sent message successfully....from w3cschool.cc");
        }catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}

