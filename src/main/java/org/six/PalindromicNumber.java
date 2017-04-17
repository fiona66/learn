package org.six;

/**
 * Created by yanglu on 4/17/17.
 */
// 回文数
public class PalindromicNumber {
    private static boolean isPlindramicNumber(int i){
        int unit = i % 10;
        int tens = (i / 10) % 10;
        int kbit = (i/1000)%10;
        int myriabit = i/10000;
        if (unit==myriabit && tens==kbit) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int count =0;
        for (int i = 10000; i <= 99999; i++) {
            if(isPlindramicNumber(i)){
                System.out.println(i+"是回文数");
                count++;
            }
        }
        System.out.println("五位数的回文数一共有"+count+"个");
    }
}
