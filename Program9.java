/*  Manan Bedi B.Sc(1) 19535 */
package program9;
import java.awt.*;

public class Program9 {

    public static void main(String[] args) {
        
           Frame frm = new Frame("Frame Title Bar");
            Label lbl = new Label("This is my first frame", Label.CENTER);
            frm.add(lbl);
            frm.setBackground(Color.pink);
            frm.setSize(400, 400);
            frm.setVisible(true);
    }
    
}
