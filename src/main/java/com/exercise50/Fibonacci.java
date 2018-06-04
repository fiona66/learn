package com.exercise50;
//1.斐波那契数列1，1，2，3，5，8，13，24......
//有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？

public class Fibonacci {
    private static int rabbit(int n){
        if (n==1||n==2){
            return 1;
        }else {
        return rabbit(n-1)+rabbit(n-2);
        }
    }

    public static void main(String[] args) {
        for(int n=1;n<=10;n++){
            System.out.println("第"+n+"月的兔子总对数为："+rabbit(n));
        }

    }
}
