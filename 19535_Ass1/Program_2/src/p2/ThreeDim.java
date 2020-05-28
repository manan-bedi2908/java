/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;
import p1.TwoDim;
/**
 *
 * @author WINDOWS 10
 */
public class ThreeDim extends TwoDim {
            private
            int z;
    
            public ThreeDim(){
               super(0,0);
                z = 0;
            }
            
            public ThreeDim(int x, int y, int z){
                super(x,y);
                this.z = z;
            }
            
    @Override
            public String toString(){
                return(super.toString() + "\nValue of z = " + z);
            }
}
