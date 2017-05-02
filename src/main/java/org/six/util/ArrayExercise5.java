package org.six.util;

/**
 * Created by yanglu on 5/2/17.
 */
public class ArrayExercise5 {
    public static void sumDiagonal(int[][] array){
        int leftSum=0;
        int rightSum=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j){
                    System.out.println("左对角线元素有"+array[i][j]);
                    leftSum+=array[i][j];
                }
                if(i+j==2){
                    System.out.println("右对角线元素有"+array[i][j]);
                    rightSum+=array[i][j];
                }
            }

        }
        System.out.println("左对角线上元素:"+leftSum);
        System.out.println("右对角线上元素:"+rightSum);
    }

    public static void main(String[] args) {
        int array1[][]= {{1,9,5},{4,6,0},{3,2,7}};
        sumDiagonal(array1);
    }
}
