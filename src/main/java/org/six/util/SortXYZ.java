package org.six.util;

/**
 * Created by yanglu on 4/19/17.
 */
public class SortXYZ {
    public static void Sort(int x,int y,int z){
        int temp=0;
        if(x>y){
            temp = x;
            x = y;
            y = temp;
        }
        if(x>z){
            temp = x;
            x = z;
            z = temp;
        }
        if(y>z){
            temp = y;
            y = z;
            z = temp;
        }
        System.out.println("从小到大排序后为"+x+" "+y+" "+z);
    }
}
