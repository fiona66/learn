package com.exercise50;

//3.水仙花数
//打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
// 例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。

public class DaffodilsNumber {
    public static boolean isDaffodilsNumber(int i){
        boolean isdaffodilsnumer = true;
        double one=i%10;
        double ten=(i%100)/10;
        double hundred=i/100;
        int sum=(int)Math.pow(one,3)+(int)Math.pow(ten,3)+(int)Math.pow(hundred,3);
        for(int n=1;n<i;n++) {
            if(i!=sum){
                isdaffodilsnumer=false;
                break;
            }else {
                isdaffodilsnumer=true;
            }
        }
        return isdaffodilsnumer;
    }

    public static void main(String[] args) {
        int count=0;
        for (int n=100;n<1000;n++){
            if(isDaffodilsNumber(n)){
                count++;
                System.out.println(n+"是水仙花数");
            }
        }
        System.out.println("三位数的水仙花数有:"+count+"个");
    }

}
