/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab2;

/**
 *
 * @author Ron
 */
public class RequiredValueException extends RuntimeException {
    private final static String message = "Must have a value";
    
                   
    public RequiredValueException(){
    }
    
    public RequiredValueException(String msg){
        super(message);
    }
    
    public RequiredValueException(String msg, Throwable cause){
        super(message, cause);
    }
    public RequiredValueException(Throwable cause){
        super(cause);
    }
    
    @Override
    public String getMessage(){
        return message;
    }
    
    
}
