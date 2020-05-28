/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program_4;
import java.util.*;
/**
 *
 * @author WINDOWS 10
 */
public class ExceptionDEmo {
    static void test(int age)
    {
        try{
            
            if(age < 18)
                throw new Underage("Under Age: ");
            else
                System.out.println("Eligible");
        }
        
        catch(Underage msg){
            
            System.out.println("Exception is thrown");
            System.out.println(msg.toString() + age);
              msg.printStackTrace();
        }
        
    }
        
    public static void main(String[] args) {
  
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Age:  ");
        int age = inp.nextInt();
        test(age); 
    }
}
