package org.six.util;

import static java.lang.StrictMath.sqrt;

/**
 * Created by yanglu on 4/18/17.
 */
public class PrimeNumber {
    public static boolean isPrimeNumber(int i){
        for(int j = 2; j<=sqrt(i); j++){
            if(i%j==0){
                return false;
            }
        }return true;
    }

    public static void main(String[] args) {
        int count=0;
        for(int i=101;i<200;i++){
            if(isPrimeNumber(i)){
                count++;
                System.out.println(i+"是素数");
            }
        }
        System.out.println("100-200之间的素数有:"+count+"个");
    }
}
