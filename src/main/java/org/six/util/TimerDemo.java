package org.six.util;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

public class TimerDemo {
    Timer timer;
    public TimerDemo(){
        timer = new Timer();
        Date firsttime = new Date(117,4,22,19,49,03);
        System.out.println(firsttime);
        timer.schedule(new TimerTaskTest(),firsttime,60000);
    }

    public static void main(String[] args) {
        new TimerDemo();
    }
}



