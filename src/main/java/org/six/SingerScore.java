package org.six;

/**
 * Created by yanglu on 4/14/17.
 */
public class SingerScore {
    public static void main(String[] args) {
        double[] scores = {1,2,3,4,5,6,7,8,9,10};
        rate(scores);


        for (double a : scores) {
            System.out.println(a);
        }

    }

    public static void rate(double[] score){
        double max;
        double min;
        double sum = 0;
        max = score[0];
        min = score[0];
        double finalsum;
        for(int i=0; i<score.length; i++){
            sum += score[i];
            if(max<score[i]){
                max = score[i];
            }
            if(score[i]<min){
                min = score[i];
            }
        }
        finalsum =(sum-max-min)/8;
        System.out.println("最低分为:"+min);
        System.out.println("最高分为:"+max);
        System.out.println("最终分数为"+finalsum);

    }
}
