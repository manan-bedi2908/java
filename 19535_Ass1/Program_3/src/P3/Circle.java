/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P3;
import P1.Shape;
import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Circle extends Shape {
     private 
            double r,ar;
    
    public
            Circle()
            {
                r = 1;
            }
            
            Circle(double r)
            {
                this.r = r;
            }
            
    @Override
            public void input()
            {
                System.out.print("Enter Radius: ");
                Scanner inp = new Scanner(System.in);
                r = inp.nextDouble();
            }
            
    @Override
            public void area()
            {
                ar = Math.PI * r * r;
            }
            
    @Override
            public String toString()
            {
                return("Area of rectangle = " + ar);
            }           
}
