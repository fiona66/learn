package org.six.util;

/**
 * Created by yanglu on 4/20/17.
 */
public class Recursion {
    public static int caculateRecursion(int n) {
        if(n==1){
            return 1;
        }else {
            return n*caculateRecursion(n-1);
        }

    }
}
