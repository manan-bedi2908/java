package program_5;
import java.util.Scanner;

public class Program_5 {

    
    public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
        
        Stack S = new Stack();
        
        int ch,el,i;
                
        while(true) 
        {
            System.out.println("\n****Program to implement Stack****");
            System.out.println("(1) Push Elements in Stack");
            System.out.println("(2) Pop Element from Stack");
            System.out.println("(3) Print Elements in Stack");
            System.out.println("(4) Exit");
            System.out.print("  Enter Choice: ");
            ch = inp.nextInt();
            System.out.println();
            switch(ch)
            {
                case 1: System.out.print("Enter Element: " );
                        el = inp.nextInt();
                        S.push(el);
                        break;
                        
                case 2: S.pop();
                        break;
                        
                case 3: S.print(); 
                        break;
                        
                case 4: System.exit(0);
            }           
        }
    }
    
}
