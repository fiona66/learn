package org.six.util;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

public class TimerDemo {
    Timer timer;
    public TimerDemo(){
        timer = new Timer();
        Date firsttime = new Date(117,5,22,19,8,00);
        System.out.println(firsttime);
        timer.schedule(new TimerTaskTest(),firsttime,100);
    }

    public static void main(String[] args) {
        new TimerDemo();
    }
}



