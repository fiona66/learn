package org.six.util;

/**
 * Created by yanglu on 4/20/17.
 */
public class MultiplicationTable {
    public static void printMutiplicationTable(){
        for(int i=1;i<10;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printMutiplicationTable();
    }
}
