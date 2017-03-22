package org.six.practice;

/**
 * Created by yanglu on 3/22/17.
 */
public class Loops {
    public static void main(String args[]) {
//        // while循环
//        int x = 10;
//        while( x < 20 ) {
//            System.out.print("value of x : " + x );
//            x++;
//            System.out.print("\n");
//        }

//        // do while循环
//        int x = 10;
//
//        do{
//            System.out.print("value of x : " + x );
//            x++;
//            System.out.print("\n");
//        }while( x < 20 );

//        // for循环
//        for(int x = 10; x < 20; x = x+1) {
//            System.out.print("value of x : " + x );
//            System.out.print("\n");
//        }

//        // 增强for循环
//        int [] numbers = {10, 20, 30, 40, 50};
//
//        for(int x : numbers ){
//            System.out.print( x );
//            System.out.print(",");
//        }
//        System.out.print("\n");
//        String [] names ={"James", "Larry", "Tom", "Lacy"};
//        for( String name : names ) {
//            System.out.print( name );
//            System.out.print(",");
//        }


//        // continue
//        int [] numbers = {10, 20, 30, 40, 50};
//
//        for(int x : numbers ) {
//            if( x == 30 ) {
//                continue;
//            }
//            System.out.print( x );
//            System.out.print("\n");
//        }
        // 练习笔记
        for(int i=1; i<=3; i++){
            for(int n=1; n<=3; n++){
                //输出结果。。。。
                System.out.println("i = " + i + ", n = " + n);
            }
        }
    }
}
