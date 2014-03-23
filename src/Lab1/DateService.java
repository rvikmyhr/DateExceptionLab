/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Ron
 */
public class DateService {

    private Date date;
    private Calendar calendar;
    
    public void convertStringToDate(String dateString){
        String format = "M/d/yyyy";
        SimpleDateFormat strToDate = new SimpleDateFormat(format);
        try{
        date = strToDate.parse(dateString);
        } catch(ParseException pe){
            System.out.println("Use correct format");
        }
    }
    
    public void convertStringToCalendar(String dateString){
        calendar = Calendar.getInstance();
        String format = "MMMMM d, yyyy h:mm a";
        SimpleDateFormat strToDate = new SimpleDateFormat(format);
        try{
        calendar.setTime(strToDate.parse(dateString));
        } catch(ParseException pe){
            System.out.println("Use correct format");
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }
    
    
    
    public static void main(String[] args) {
        DateService ds = new DateService();
        ds.convertStringToDate("3/15/2014");
        System.out.println(ds.getDate());
        ds.convertStringToCalendar("March 15, 2014 2:30 PM");
        System.out.println(ds.getCalendar());
    }
    
}
