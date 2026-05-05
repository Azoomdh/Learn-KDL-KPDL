
package com.example.demoKDLv1.ZZZ_Util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Timestamp_Util{
    private static String timeFormat= "dd:MM:yyyy HH:mm:ss";

    public static Date convertString2DateUtils(String time){
        try {
            SimpleDateFormat timeFormater= new SimpleDateFormat(Timestamp_Util.timeFormat);
            Date date1= timeFormater.parse(time);
            return date1;
        }
        
        catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Timestamp convertDateUtils2Timestamp(Date date1){
        return new Timestamp(date1.getTime());
    }
}