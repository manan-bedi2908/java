/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program_2;
import p1.TwoDim;
import p2.ThreeDim;
/**
 *
 * @author WINDOWS 10
 */
public class Program_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TwoDim two = new TwoDim();
        ThreeDim three = new ThreeDim();
        
        TwoDim sup;
        
        
        sup = two;
        
        System.out.println(sup.toString());
        
        sup = three;

        System.out.println(sup.toString());
    }
    
}
