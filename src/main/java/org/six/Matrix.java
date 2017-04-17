package org.six;

/**
 * Created by yanglu on 4/17/17.
 */
public class Matrix {
    static int[][] sumDiagonalElement(int array[][]){
        int sum =0;
        // 找出对角线元素
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if(i==j){
                    System.out.println(array[i][j]);
                    //求对角线元素之和
                    sum += array[i][j];
                }
            }
        }
        System.out.println("对角线元素之和为:"+sum);
        return array;
    }

    public static void main(String[] args) {
        int array[][] = {{1, 9, 5}, {4, 6, 0}, {3, 2, 7}};
        sumDiagonalElement(array);
    }
}
