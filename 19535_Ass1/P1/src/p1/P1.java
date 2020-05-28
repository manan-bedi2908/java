package p1;
import java.util.*;
public class P1 {

    public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);
        
        Complex cmp = new Complex();
        
        int ch;
        char ch1;
        do
        {
            int r1,r2,i1,i2;
            System.out.println("**** Program to Add and Multiply 2 Complex Numbers using class Complex ****");
            System.out.println("(1) Add");
            System.out.println("(2) Multiply");
            System.out.print("Enter Choice:  ");
            
            ch = inp.nextInt();
            
            System.out.print("Enter Real part: ");
            r1 = inp.nextInt();
            System.out.print("Enter Imaginary part: ");
            i1 = inp.nextInt();
        
            System.out.println();
        
            System.out.print("Enter Real part: ");
            r2 = inp.nextInt();
            System.out.print("Enter Imaginary part: ");
            i2 = inp.nextInt();
        
            System.out.println();
            
            if(ch==1){
                cmp.add(r1, i1, r2, i2);
                System.out.println(cmp.toString());
            }
            else if(ch==2){
                cmp.mul(r1, i1, r2, i2); 
                System.out.println(cmp.toString());
            }
            else 
                System.out.println("Invalid Input");
            
            System.out.println("Do you want to continue? (y/n): ");
            
            ch1 = inp.next().charAt(0);
            
        }while(ch1 == 'y');

    }
    
}
