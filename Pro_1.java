/*  Manan Bedi B.Sc(1) 19535
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro_1;
import java.io.*;
/**
 *
 * @author WINDOWS 10
 */
class Pro_1 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;
        
        if(args.length !=2) {
            System.out.println("File not uploaded");
            return;
        }
        
        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
            do {
                i = fin.read();
                if(i != -1) 
                    fout.write(i);
            } while(i!=-1);
        } catch(IOException e) {
            System.out.println("I/O Error: " + e);
        } finally {
            try {
                if (fin!=null) {
                    fin.close();
                }
            } catch(IOException e2) {
                System.out.println("Error closing output file");
            }
            try {
                if (fout != null) 
                    fout.close();
            } catch(IOException e2) {
                System.out.println("Error closing output file");
            }
        }
    }
    
}
