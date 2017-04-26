package org.six.util;

/**
 * Created by yanglu on 4/26/17.
 */
public class ArrayExercise3 {
    public static int[] ArrayRemoveZero(int[] Array){
        int zerocount=0;
        for(int i=0;i<Array.length;i++){
            if(Array[i]==0){
                zerocount++;
            }
        }
        int [] newArray=new int[Array.length-zerocount];
        int j=0;
        for(int i=0;i<Array.length;i++){
            if(Array[i]!=0){
                newArray[j]=Array[i];
                j++;
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int oldArray[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        int[] newArray=ArrayRemoveZero(oldArray);

        for(int b:newArray){
            System.out.println(b);
        }
    }
}
