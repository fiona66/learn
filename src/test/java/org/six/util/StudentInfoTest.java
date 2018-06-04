package org.six.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yanglu on 8/9/17.
 */
public class StudentInfoTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testStudentInfo(){
        StudentInfo sNo1= new StudentInfo(01,"杨一","女",18,80);
        System.out.println(sNo1);
        StudentInfo sNo2= new StudentInfo(02,"戴二","男",20,92);
        System.out.println(sNo2);
        StudentInfo sNo3= new StudentInfo(03,"张三","男",21,60);
        System.out.println(sNo3);
        StudentInfo sNo4= new StudentInfo(04,"李四","男",19,54);
        System.out.println(sNo4);
        StudentInfo sNo5= new StudentInfo(05,"王五","女",22,77);
        System.out.println(sNo5);

        double jScore1=sNo1.getJava();
        double jScore2=sNo2.getJava();
        double jScore3=sNo3.getJava();
        double jScore4=sNo4.getJava();
        double jScore5=sNo5.getJava();

        double averageScore=(jScore1+jScore2+jScore3+jScore4+jScore5)/5;
        System.out.println("平均分为:"+averageScore);

        double[] jScores={jScore1,jScore2,jScore3,jScore4,jScore5};
        double max = jScores[0],min = jScores[0];
        for(int i=0;i<jScores.length;i++){
            if(max<jScores[i]){
                max=jScores[i];
            }
            if(jScores[i]<min){
                min=jScores[i];
            }
        }
        System.out.println("Java最高分为:"+max);
        System.out.println("Java最低分为:"+min);


    }

}