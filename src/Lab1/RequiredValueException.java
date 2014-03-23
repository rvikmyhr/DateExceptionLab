/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab1;

/**
 *
 * @author Ron
 */
public class RequiredValueException extends Exception {
    private final static String ERROR = "Must have a value";
    
            
            
    public RequiredValueException(){
        super(ERROR);
    }
    
}
