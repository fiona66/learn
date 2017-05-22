package org.six.util;

import java.util.Date;
import java.util.TimerTask;


public class TimerTaskTest extends TimerTask {

    @Override
    public void run() {
//        Date date = new Date(this.scheduledExecutionTime());
        Date date = new Date();
        System.out.println("当前时间为："+date);
    }

}

