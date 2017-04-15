package org.six;

/**
 * Created by yanglu on 4/15/17.
 */
public class CreateNewArray {

    public static int[] deleteOldArray(int [] array){
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]!= 0){
                count++;
            }
        }
        int [] newArr = new int[count];
        int j=0;
        for(int i=0;i<array.length;i++){
            if(array[i]!= 0){
                newArr[j] = array[i];
                j++;
            }
        }
        return newArr;

    }

    public static void main(String[] args) {
        int ordArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5,0};
        int[] newArr = deleteOldArray(ordArr);

        for (int b : newArr) {
            System.out.println(b);
        }

    }
}
