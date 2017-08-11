package org.six.util;

/**
 * Created by yanglu on 8/9/17.
 */
public class StudentInfo {
    private int sNO,sAge;
    private String sName,sSex;
    private double sJava;

    public  StudentInfo(int sNO,String sName,String sSex,int sAge,double sJava){
        this.sNO=sNO;
        this.sName=sName;
        this.sSex=sSex;
        this.sAge=sAge;
        this.sJava=sJava;
    }

    @Override
    public String toString() {
        return "学生信息:" +
                "学号:" + sNO +
                ", 年龄:" + sAge +
                ", 姓名:" + sName  +
                ", 性别:" + sSex  +
                ", java课成绩:" + sJava +
                ';';
    }

    public int getNO() {
        return sNO;
    }

    public String getName() {
        return sName;
    }

    public String getSex() {
        return sSex;
    }

    public int getAge() {
        return sAge;
    }

    public double getJava() {
        return sJava;
    }

}
