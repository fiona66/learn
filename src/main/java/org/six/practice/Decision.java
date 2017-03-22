package org.six.practice;

/**
 * Created by yanglu on 3/22/17.
 */
public class Decision {
    public static void main(String args[]){
//        // if语句
//        int x = 10;
//
//        if( x < 20 ){
//            System.out.print("这是 if 语句");
//        }

//        // if...else
//        int x = 30;
//
//        if( x < 20 ){
//            System.out.print("这是 if 语句");
//        }else{
//            System.out.print("这是 else 语句");
//        }

//        // if...else if...else
//        int x = 30;
//
//        if( x == 10 ){
//            System.out.print("Value of X is 10");
//        }else if( x == 20 ){
//            System.out.print("Value of X is 20");
//        }else if( x == 30 ){
//            System.out.print("Value of X is 30");
//        }else{
//            System.out.print("这是 else 语句");
//        }

//        //嵌套的 if…else 语句
//        int x = 30;
//        int y = 10;
//
//        if( x == 30 ){
//            if( y == 10 ){
//                System.out.print("X = 30 and Y = 10");
//            }
//        }

        // switch
        //char grade = args[0].charAt(0);
        char grade = 'C';

        switch(grade)
        {
            case 'A' :
                System.out.println("优秀");
                break;
            case 'B' :
            case 'C' :
                System.out.println("良好");
                break;
            case 'D' :
                System.out.println("及格");
            case 'F' :
                System.out.println("你需要再努力努力");
                break;
            default :
                System.out.println("未知等级");
        }
        System.out.println("你的等级是 " + grade);

    }
}
