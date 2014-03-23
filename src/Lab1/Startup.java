/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;

import Lab2.DateService;

/**
 *
 * @author Ron
 */
public class Startup {
    
    public static void main(String[] args) {
    
        Invoice invoice = new Invoice();
        
        System.out.println(invoice.getNewDueDate());
        System.out.println(invoice.getDueDateAsString());
        
        try{
        invoice.setGracePeriod(-5);
        } catch (IllegalArgumentException ia) {
            System.out.println("Must be atleast 0");
        }
        
    }
}
