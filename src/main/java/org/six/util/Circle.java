package org.six.util;

/**
 * Created by yanglu on 7/5/17.
 */
public class Circle {
    // 成员变量Radius(私有,浮点型)
    // 存放圆的半径
    private double Radius;

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }

    // 构造方法1,将半径设为0
    public Circle(){
        Radius=0;
    }

    // 构造方法2,创建Circle对象将半径初始化为r
    public Circle(double r){
        this.Radius=r;
    }

    // 成员方法1,获取圆的面积
    public double getArea(double r){
        double area=3.14*r*r;
        return area;
    }

    // 成员方法2,获取圆的周长
    public double getPerimeter(double r){
        double perimeter = 3.14*2*r;
        return perimeter;
    }

    // 成员方法3,将圆的半径,周长,面积输出到屏幕
    public void show(){
        System.out.println("圆的半径为:"+this.Radius);
        System.out.println("圆的周长为:"+this.getPerimeter(Radius));
        System.out.println("圆的面积为:"+this.getArea(Radius));
    }

}
