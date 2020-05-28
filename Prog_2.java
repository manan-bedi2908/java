/*  Manan Bedi B.Sc(1) 19535 */
package prog_2;
import java.io.*;
import java.io.FileReader;
import java.io.BufferedReader;
public class Prog_2 {

   
    public static void main(String[] args) {
        if(args.length !=1) {
            System.out.println("Error");
        }
        try(FileReader input = new FileReader(args[0]); BufferedReader br = new BufferedReader(input);) {
            String data = br.readLine();
            
            char first;
            char second;
            
            while(data!=null){
                first = data.charAt(0);
                second = data.charAt(1);
                if(first == '/' && second=='/') {
                    System.out.println(data);
                }
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    
}
