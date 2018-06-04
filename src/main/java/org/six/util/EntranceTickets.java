package org.six.util;

/**
 * Created by yanglu on 7/4/17.
 */
public class EntranceTickets {
    public double EntranceTickets(int age){
        int price=499;
        int finalPrice;
        if(age>=60){
            finalPrice=(int)(price*0.5);
            System.out.println("年龄大于等于60岁的游客门票价格为:"+finalPrice);
        }else if (age >= 0 && age <= 18) {
            finalPrice = (int)(price*0.7);
            System.out.println("年龄小于等于12岁的游客门票价格为:"+finalPrice);
        }else {
            finalPrice=price;
            System.out.println("普通游客门票价格为:"+finalPrice);
        }
        return finalPrice;
    }
}
