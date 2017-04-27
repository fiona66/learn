package org.six.util;

/**
 * Created by yanglu on 4/27/17.
 */
public class ArrayExercise4 {
    public static int[] combineArray(int[] arrayA, int[] arrayB){
        int[] arrayC=new int[arrayA.length+arrayB.length];
        for (int i=0;i<arrayC.length;i++){
            if(i<arrayA.length){
                arrayC[i]=arrayA[i];
            }else {
                arrayC[i]=arrayB[i-arrayA.length];
            }
        }
        return arrayC;
    }

    public static int[] ascArray(int[] arrayC,int num){
        //插入排序
        int temp;
        int i,j;
        for (i = 1; i < num; i++)
        {
            temp = arrayC[i];
            for (j = i; j > 0 && arrayC[j - 1] > temp; j--)
                arrayC[j] = arrayC[j - 1];
            arrayC[j] = temp;
        }
        return arrayC;
    }

    public static void main(String[] args) {
        int[] arrayA={1,7,9,11,13,15,17,19};
        int[] arrayB={2,4,6,8,10};
        int[] arrayC= combineArray(arrayA,arrayB);
        ascArray(arrayC,arrayC.length);

        for(int celement:arrayC){
            System.out.println(celement);
        }
    }
}
