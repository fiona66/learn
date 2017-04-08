package org.six;

/**
 * Created by yanglu on 4/7/17.
 */
public class NarcissiFew {
    // 方法2
    private static boolean isNarcissiFew(int i){
        int a = i % 10;
        int b = (i / 10) % 10;
        int c = i / 100;
        if (a * a * a + b * b * b + c * c * c == i) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            if(isNarcissiFew(i)==true){
                System.out.println(i+"是水仙花数");
            }
        }
    }

}
