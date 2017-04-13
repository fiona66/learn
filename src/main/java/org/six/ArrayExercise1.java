package org.six;

import java.util.ArrayList;

/**
 * Created by yanglu on 4/11/17.
 */
public class ArrayExercise1 {


//    public ArrayExercise1(){
//        int size = 5;
//        int min = 0;
//        int max = 0;
//        int[] myList =new int[size];
//        myList[0] = 1;
//        myList[1] = 2;
//        myList[2] = 3;
//        myList[3] = 4;
//        myList[4] = 5;
//        for(int i=0; i<size; i++){
//            max = myList[0];
//            if(myList[i]>max){
//                int temp = max;
//                max = myList[i];
//                myList[i] = temp;
//            }
//        }
//    }

    public static void main(String[] args) {
        int[] myList = {4, 5, 2, 7,9};

        // 调用方法,交换数组中值的位置
        changeArrayPosition(myList);


        for (int a : myList) {
            System.out.println(a);
        }

    }


    public static void changeArrayPosition(int [] array) {
        int max;
        int maxPosition;
        int temp;
        max = array[0];
        maxPosition = 0;
        //找到最大值的下标
        for(int i=0; i<array.length; i++){

            if(max<array[i]){
                maxPosition = i;
                max = array[i];
            }
        }

        //TODO 用最大值和第一个值替换.
        temp = array[0];
        array[0] =array[maxPosition];
        array[maxPosition] = temp;

        //TODO 找出最小值的下标
        int min ;
        int minPosition;
        int temp1;
        min = array[0];
        minPosition = 0;
        for(int i=0; i<array.length; i++){

            if(array[i]<min){
                minPosition = i;
                min = array[i];
            }
        }

        // TODO  用最小值和最后一个值替换.
        temp1 = array[4];
        array[4] =array[minPosition];
        array[minPosition] = temp1;
    }
}
