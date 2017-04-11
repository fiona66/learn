package org.six;

/**
 * Created by yanglu on 4/10/17.
 */
public class Recursion {
    public static int recursion(int n) {
        if (n == 1) {
            return 1;
        } else {
            int result = n * recursion(n - 1);
            return result;
        }
    }
}
