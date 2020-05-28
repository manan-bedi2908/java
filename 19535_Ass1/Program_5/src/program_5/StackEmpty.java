/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program_5;

/**
 *
 * @author WINDOWS 10
 */
public class StackEmpty extends Exception{
      String err;
    
    public StackEmpty(String err){
        
        this.err = err;
    }
    
    @Override
    public String toString(){
        
        return(err);
    } 
}
