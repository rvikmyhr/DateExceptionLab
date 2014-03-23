/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Invoice {
    
    private Calendar invoiceDate;
    private int gracePeriod = 15;
    private Calendar dueDate;
    
    public Invoice(){
        this.invoiceDate = Calendar.getInstance();
        
    }
    
    public Calendar getNewDueDate(){ 
        dueDate = Calendar.getInstance();
        dueDate.add(Calendar.DAY_OF_MONTH, gracePeriod);
        return dueDate;
    }
    
    public String getDueDateAsString(){
        String dateFormat = "M/d/yyyy";
        SimpleDateFormat format = new SimpleDateFormat(dateFormat);
        Date date;      
        date = dueDate.getTime();
        String dateString = format.format(date);
        return dateString;
    }
    
    

    public Calendar getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Calendar invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public int getGracePeriod() {
        return gracePeriod;
    }

    public void setGracePeriod(int gracePeriod) {
        this.gracePeriod = gracePeriod;
    }

    public Calendar getDueDate() {
        return dueDate;
    }

    public void setDueDate(Calendar dueDate) {
        this.dueDate = dueDate;
    }
    
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        
        
        System.out.println(invoice.getNewDueDate());
        System.out.println(invoice.getDueDateAsString());
    }
    
}
