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
public class Complex {
     private
        int real=0,imag=0;
    public
               
        void add(int r1, int i1, int r2, int i2){
            
            real = r1 + r2;
            imag = i1 + i2;
        }        
            
        void mul(int r1, int i1, int r2, int i2){
            
            real = r1 * r2 - i1 * i2;
            imag = r1 * i2 + i1 * r2;
        }
        
    @Override
        public String toString(){
            
            return("Result is " + real + " + (" + imag + ")i");
        }
}
