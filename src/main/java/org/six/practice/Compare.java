package org.six.practice;

/**
 * Created by yanglu on 3/25/17.
 */
public class Compare {
    public static int max(int num1, int num2){
        int result;
        if (num1 > num2)
            result = num1;
        else
            result = num2;

        return result;
    }

    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int k = max(i, j);
        System.out.println(i+"和"+j + " 比较，最大值是：" + k);
    }
}
