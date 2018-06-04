package org.six.util;

/**
 * Created by yanglu on 7/5/17.
 */
// Cylinder类,继承与Circle类
public class Cylinder extends Circle {
    // 成员变量,圆柱体的高,私有,浮点
    private double Height;

    // 构造方法,创建Circle对象时将半径初始化为r
    public Cylinder(double r,double h){
        super(r);
        this.Height = h;// 赋值语句,属性=*值
//        this.setRadius(r);
    }

    // 成员方法1,获取圆柱体的体积 V=hπr²
    public double getVolume(){
        double Volume = Height *3.14*this.getRadius()*this.getRadius();
        return Volume;
    }

    // 成员方法2,获取圆柱体的体积输出到屏幕
    public void showVolume(){
        System.out.println("圆柱体的体积是:"+getVolume());
    }
}
