package org.six;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * Created by yanglu on 4/7/17.
 */
public class PrimeNumber {
    // 写法2
    // 注意点,主函数中须调用该方法,该方法需要修饰为static

    private static boolean isPrimeNumber(int i) {
        for (int x = 2; x < i; x++) {
            if (i % x == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i <= 200; i++) {
            boolean b = isPrimeNumber(i);
            if (b == true) {
                count++;
                System.out.println(i + "是素数");
            }
        }
        System.out.println("101-200之内的素数有" + count + "个");
    }
}