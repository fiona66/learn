package org.six;

/**
 * Created by yanglu on 4/15/17.
 */
public class AscCArray {

    public static void main(String[] args) {
        int[] arrayA = {1,7,9,11,13,15,17,19};
        int[] arrayB = {2,4,6,8,10};
        //merge
        int[] arrayC = arrayMerging(arrayA,arrayB);

        //sort
        sortArray(arrayC);

        //print
        for (int celements : arrayC) {
            System.out.println(celements);
        }
    }

    private static void sortArray(int[] arrayC) {
        //冒泡排序
        int temp =0;
        for(int x = 0;x<arrayC.length-1;x++){
            for(int y=0;y<arrayC.length-x-1;y++){
                if(arrayC[y]>arrayC[y+1]){
                    temp=arrayC[y];
                    arrayC[y]=arrayC[y+1];
                    arrayC[y+1]=temp;
                }
            }
        }
    }


    public static int[] arrayMerging(int[] A, int[] B) {
        int[] C = new int[A.length+B.length];
        int min;
        int j=0;
        int i=0;
        for(int k=0;k<C.length;k++){
            if(k<A.length){
                C[k]=A[i];
                i++;
            }
            if(k>=A.length){
                C[k]=B[j];
                j++;
            }
        }
        return C;
    }

}
