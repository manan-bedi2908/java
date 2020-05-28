package program_3;
import java.util.Scanner;
import P1.Shape;
import P2.Rectangle;
import P3.Circle;

public class Program_3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Circle cir = new Circle();
        Rectangle rec = new Rectangle();
        
        Shape sup;
        
        int ch;
        double l,b,r;
        
        while(true)
        {
            System.out.println("***** MAIN MENU *****");
            System.out.println("(1) Area of Rectangle");
            System.out.println("(2) Area of Circle");
            System.out.println("(3) Exit");
            System.out.print("  Enter Choice:  ");
            
            Scanner inp = new Scanner(System.in);
            ch=inp.nextInt();
            
            switch(ch){
                
                case 1: sup = rec;
                        sup.input();
                        sup.area();
                        System.out.println(sup.toString());
                        break;
                        
                case 2: sup = cir;
                        sup.input();
                        sup.area();
                        System.out.println(sup.toString());
                        break;
                        
                case 3: System.exit(0);
                        
            }
            
                
        }
    }
    
}
