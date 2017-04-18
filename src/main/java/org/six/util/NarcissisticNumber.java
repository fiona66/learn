package org.six.util;

/**
 * Created by yanglu on 4/18/17.
 */
public class NarcissisticNumber {
    public static boolean isNarcissisticNumber(int i){
        int units = i%10;
        int tens = (i/10)%10;
        int hundreds = i/100;
        int narcissisticsum=units*units*units+tens*tens*tens+hundreds*hundreds*hundreds;
        if(i==narcissisticsum){
            return true;
        }
        return false;
    }
}
