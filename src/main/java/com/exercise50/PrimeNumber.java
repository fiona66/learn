package com.exercise50;
//2.指定范围包含的素数
//判断101-200之间有多少个素数，并输出所有素数。

public class PrimeNumber {
    private static boolean isPrimeNumber(int n){
        boolean isprimenumber = true;
        for (int i=2;i<n;i++){
            if(n%i==0){
                isprimenumber=false;
                break;
            }else {
                isprimenumber=true;
            }}return isprimenumber;
    }

    public static void main(String[] args) {
        int count=0;
        for (int n=101;n<=200;n++){
           if(isPrimeNumber(n)){
               count++;
               System.out.println(n+"是101-200之间的素数");
           }
        }
        System.out.println("101-200之间的素数共:"+count+"个");
    }
}
