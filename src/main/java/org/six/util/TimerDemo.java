package org.six.util;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

public class TimerDemo {
    Timer timer;
    public TimerDemo(){
        timer = new Timer();
        Date firsttime = new Date(117,5,11,11,30,03);
        System.out.println(firsttime);
        timer.schedule(new TimerTaskTest(4),firsttime,60000*60*24);
    }

    public static void main(String[] args) {
        new TimerDemo();
    }
}



