package org.six;

/**
 * Created by yanglu on 4/9/17.
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        for(int i=1;i<10;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+" ");
            }
            System.out.println();
        }
    }
}
