package org.six.util;

/**
 * Created by yanglu on 4/23/17.
 */
public class ArrayExercise1 {
    public static void printArray(int[] array){
        int max;
        int min;
        int maxPosition = 0;
        int minPosition =0;
        max=array[0];
        min=array[0];
        for(int i=0;i<array.length;i++){
            if(max<array[i]){
                maxPosition = i;
                max=array[i];
            }
            if(array[i]<min){
                minPosition = i;
                min=array[i];
            }
        }
        int temp = array[0];
        array[0] = array[maxPosition];
        array[maxPosition]=temp;

        if(minPosition!=0){
            int temp1 = array[array.length-1];
            array[array.length-1] = array[minPosition];
            array[minPosition]=temp1;
        }
    }

    public static void main(String[] args) {
        int[] arrayA ={4,7,2,5,9};
        printArray(arrayA);
        for(int a: arrayA){
            System.out.println(a);
        }
        System.out.println("*****************");
        int[] arrayB = {4,5,8,7,9};
        printArray(arrayB);
        for(int b: arrayB){
            System.out.println(b);
        }
    }
}
