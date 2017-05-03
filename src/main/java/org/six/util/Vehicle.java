package org.six.util;

/**
 * Created by yanglu on 5/3/17.
 */
public class Vehicle {
    private int speed;
    private double size;

    public void move(){

    }

    public void setSpeed(int speed){
        this.speed=speed;
        this.size=speed/2;
        System.out.println("初速度为:"+speed+","+"体积为"+size);
    }

    public void speedUp(){
        speed++;
        System.out.println("增速后,当前速度为"+speed);
    }

    public void speedDown(){
        speed--;
        System.out.println("减速后,当前速度为"+speed);
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setSpeed(4);
        vehicle.speedUp();
        vehicle.speedDown();
    }
}
