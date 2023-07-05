package com.inventario.util;

import lombok.extern.slf4j.Slf4j;

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Slf4j
public class DateUtils {


    public static Calendar parseStringToCalendar(String dateArrived){

        if (dateArrived == null)
            return null;

        Calendar dateCalendarParsed =  Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss") ;
        try {
            dateCalendarParsed.setTime(dateFormat.parse(dateArrived));
        } catch (ParseException e) {
            log.error( "Error [DateUtils][parseStringToCalendar] try parse date: ", e.getMessage());
            //e.printStackTrace();
            return null;
        }

        return dateCalendarParsed;
    }
    public static Calendar parseBBDDToCalendar(String dateArrived){
        Calendar dateCalendarParsed =  Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd' 'HH:mm:ss") ;
        try {
            dateCalendarParsed.setTime(dateFormat.parse(dateArrived));
        } catch (ParseException e) {
            log.error( "Error [DateUtils][parseStringToCalendar] try parse date: ", e.getMessage());
            //e.printStackTrace();
            return null;
        }

        return dateCalendarParsed;
    }

    public static String parseCalendarToString(Calendar dateArrived){
        String dateCalendarParsed;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss") ;
        return  dateFormat.format(dateArrived.getTime()) ;
    }

    public static String getDaysInLetters(Calendar dateArrived){
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE");
        return formatter.format(dateArrived.getTime());
    }

    public static String getMonthInLetters(int num) {
        String month = "wrong";
        DateFormatSymbols dfs = new DateFormatSymbols();
        String[] months = dfs.getMonths();
        if (num >= 0 && num <= 11) {
            month = months[num];
        }
        return month;
    }


}
