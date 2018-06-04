package com.exercise50;
//4.分解质因数
//将一个正整数分解质因数。例如：输入90,打印出90=233*5。
public class DecompositionFactor {
    private static void decompose(int n){
        System.out.print(n+"=");
        for(int i=2;i<n+1;i++){
            while(n%i==0 & n!=i){
                System.out.print(i+"*");
                n=n/i;
            }if(n==i){
                System.out.print(i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int n=90;
        decompose(n);
    }
}
