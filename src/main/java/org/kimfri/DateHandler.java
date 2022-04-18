package org.kimfri;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DateHandler {
    long getMilliSeconds(MyClock myClock) {
        return myClock.millis();
    }

    void getSomething(MyClock myClock) {
        final Instant instant = myClock.instant();
        System.err.println(instant.toEpochMilli());
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.err.println(myClock.millis());
    }

    int getHourAgain(MyClock myClock) {
        return LocalDateTime.ofInstant(myClock.instant(), ZoneId.systemDefault()).getHour();
    }
}
