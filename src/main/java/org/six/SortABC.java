package org.six;

/**
 * Created by yanglu on 4/8/17.
 */
public class SortABC {
    public SortABC(int x,int y,int z){
        int temp = 0;
        if(x<y&&x<z){
            if(y>z){
                temp = y;
                y = z;
                z = temp;
            }
        }

        if(x<y&&x>z){
            temp = x;
            x = z;
            z = temp;
            temp = y;
            y = z;
            z = temp;
        }

        if(x<z&&x>y){
            temp = x;
            x = y;
            y = temp;
        }

        if(x>y&&x>z){
            temp = x;
            x = z;
            z = temp;
            if (y>z){
                temp = y;
                y = z;
                z = temp;
            }
        }

        System.out.println("x,y,z由小到大排列依次是:"+x+","+y+","+z);
        return;
    }
}
