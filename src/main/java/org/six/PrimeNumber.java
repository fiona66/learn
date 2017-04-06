package org.six;

/**
 * Created by yanglu on 4/6/17.
 */
public class PrimeNumber {
    
    public static void main(String[] args) {
        // 定义一个count,接收累计素数个数
        int count = 0;
        // 循环体:101至200之内的数
        for (int i = 101; i <= 200; i++) {
//            PrimeNumber primeNumber = new PrimeNumber();
            boolean b = isPrimeNumber(i);
            //循环体:2至该数,预备验证概述是否被其他数整除

            if (b == true) {
                count++;
                System.out.println(i + "是素数");
            }
            // 如果不能被当前数整除,该数可能是素数,x++

            // 若均不能被2-(i-1)的数整除,该数是素数,count+1,打印该数
        }
        System.out.println("素数有" + count + "个");

    }

        private static boolean isPrimeNumber(int i)
        {
            for (int xx = 2; xx < i; xx++)
            {
                if(i%xx==0)
                {
                return false;
                }
            }
            return true;
        }

}




