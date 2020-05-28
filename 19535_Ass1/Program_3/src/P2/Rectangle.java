/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2;
import P1.Shape;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class Rectangle extends Shape {
     private
            double ar,l,b;
    public
            Rectangle()
            {
                l = 1;
                b = 1;
            }
            
            Rectangle(double l,double b)
            {
                this.l = l;
                this.b = b;
            }
            
    @Override
            public void input()
            {
                Scanner inp = new Scanner(System.in);
                System.out.print("Enter Length: ");
                l = inp.nextDouble();
                System.out.print("Enter Breadth: ");
                b = inp.nextDouble();
            }
            
    @Override
            public void area()
            {
                ar = l * b;
            }
            
    @Override
            public String toString()
            {
                return("Area of rectangle = " + ar);
            }
}
