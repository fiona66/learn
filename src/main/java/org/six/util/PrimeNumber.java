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
}