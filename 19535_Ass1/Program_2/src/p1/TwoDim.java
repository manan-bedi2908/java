/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author WINDOWS 10
 */
public class TwoDim {
        private
            int x,y;
    
            public TwoDim(){
                x=0;
                y=0;
            }
            
            public TwoDim(int x, int y){
                this.x = x;
                this.y = y;
            }
            
    @Override
            public String toString(){
                return("Value of x = " + x + "\nValue of y = " + y);
            }    
}   
