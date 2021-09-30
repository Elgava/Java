/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author elgin
 */
public class dateObject {

    public static void main(String[] args) {
        LocalDateTime myDateTime = LocalDateTime.now();
        LocalDate myDate = LocalDate.now();
        LocalTime myTime = LocalTime.now();
//        System.out.println("dateTime: " + myDateTime.now()
//                           + "\nDate: " + myDate
//                           + "\nTime: " + myTime);

//        myDate = myDate.minusMonths(11);
//        myDate = myDate.plusWeeks(4);
//        System.out.println("the date a while back: " +myDate);
        JapaneseDate japD8 = JapaneseDate.from(myDate);
        System.out.println("the japanese date of today: " + japD8);
        
        String Dday = myDateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("Date today in ISO_DTAE_TIME" + Dday);
        
        String dDay = myDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("Date today in relative ENG: " + dDay);
        
        String formDate = myDateTime.format(DateTimeFormatter.ofPattern("yy/dd/mm ss/mm/HH"));
        System.out.println("the date in my own format: " + formDate);
    }
}
