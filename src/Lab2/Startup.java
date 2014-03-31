/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

import Lab1.*;
import Lab2.DateService;

/**
 *
 * @author Ron
 */
public class Startup {
    
    public static void main(String[] args) {
        
        DateService ds = new DateService();
        try {
            ds.convertStringToDate("");
        } catch (RuntimeException rt) {
            System.out.println(rt.getMessage());
        }
        
        System.out.println(ds.getDate());
        try {
            ds.convertStringToCalendar("March 15, 2014 2:30 PM");
        } catch (RuntimeException rt) {
            System.out.println(rt.getMessage());
        }
        System.out.println(ds.getCalendar());
        
        try {
        ds.setDate();
        } catch (RuntimeException rt) {
            System.out.println("Cant be null");
        }
        
        try{
        ds.setCalendar();
        } catch (RuntimeException rt) {
            System.out.println("Cant be null");
        }
       
    }
}
