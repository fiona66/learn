package org.six.util;

/**
 * Created by yanglu on 4/23/17.
 */
// 歌手打分,去掉最高分&最低分,取平均数
public class ArrayExercise2 {
    public static void AverageScore(double[] array){
        double min=array[0];
        double max=array[0];
        double sum=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max = array[i];
            }
            if(array[i]<min){
                min = array[i];
            }
            sum += array[i];
        }
        System.out.println("分别去掉1个最低分&最高分,最终分数为"+(sum-min-max)/(array.length-2));
    }
}
