package org.six;

/**
 * Created by yanglu on 4/17/17.
 */
// 回文数
public class PalindromicNumber {
    static int count =0;
    private static boolean isPlindramicNumber(int i){
        int unit = i % 10;
        int tens = (i / 10) % 10;
        int kbit = (i/1000)%10;
        int myriabit = i/10000;
        if (unit==myriabit && tens==kbit) {
            count++;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        for (int i = 10000; i <= 99999; i++) {
            if(isPlindramicNumber(i)==true){
                System.out.println(i+"是回文数");
            }
        }
        System.out.println("五位数的回文数一共有"+count+"个");
    }
}
