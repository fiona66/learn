package org.six.util;

/**
 * Created by yanglu on 5/3/17.
 */
public class GuessNumber {
    private int v=100;

    public void isRightNumber(int i){
        if(i>v){
            System.out.println("大了");
        }
        if(i<v){
            System.out.println("小了");
        }
        if(i==v){
            System.out.println("猜对了");
        }
    }
}
