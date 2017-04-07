package org.six;

/**
 * Created by yanglu on 4/7/17.
 */
public class PrimeNumber {
    // 写法1
    public static void main(String[] args) {
        int count = 0;
        for(int i=101;i<=200;i++){
            boolean b = true;
            for(int x=2;x<i;x++){
                if(i%x==0){
                    b = false;
                    break;
                }
            }
            if(b==true){
                count++;
                System.out.println(i+"是素数");
            }
        }
        System.out.println("101-200之间素数一共有:"+count+"个");
    }
}
