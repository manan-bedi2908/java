/* Manan Bedi B.Sc(1) 19535) */
package prog9swings;
import java.awt.*;
import javax.swing.*;

class swings2 extends JFrame {
    JFrame fr = new JFrame("Title"); 
    JLabel label = new JLabel("Frame with a Center-aligned String", JLabel.CENTER);
        
    swings2(){
        add(label);
        getContentPane().setBackground(Color.CYAN);
        setSize(500, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
public class Prog9swings {

    public static void main(String[] args) {
        swings2 s=new swings2();
    }
    
}
