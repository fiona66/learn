package org.six.util;

/**
 * Created by yanglu on 4/27/17.
 */
public class PalindromiNumber {
    public static boolean isPalindromiNumber(int i) {
        int unit = i % 10;
        int tens = (i / 10) % 10;
        int kbits = (i / 1000) % 10;
        int myriabit = i / 10000;
        if (unit == myriabit && tens == kbits)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int count=0;
        for(int i=10000;i<100000;i++){
            if(isPalindromiNumber(i)){
                System.out.println(i+"是回文数");
                count++;
            }
        }
        System.out.println("5位数以内的回文数一共有"+count+"个");
    }
}
