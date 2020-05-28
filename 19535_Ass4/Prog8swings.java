/* Manan Bedi B.Sc(1) 19535) */

package prog8swings;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class swings1 extends JFrame implements MouseListener{
     JLabel l = new JLabel();
     JFrame f = new JFrame();
       
     swings1(){
        l.setBounds(50,200,300,50);
        l.setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setLayout(null);
        add(l);
        addMouseListener(this);
     }
     @Override
            public void mouseClicked(MouseEvent e) {
                getContentPane().setBackground(Color.pink);
                l.setText("Mouse Clicked");
                l.setBackground(Color.pink);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                getContentPane().setBackground(Color.orange);
                l.setText("Mouse Pressed");
                l.setBackground(Color.orange);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                getContentPane().setBackground(Color.blue);
                l.setText("Mouse Released");
                l.setBackground(Color.blue);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                getContentPane().setBackground(Color.green);
                l.setText("Mouse Entered");
                l.setBackground(Color.green);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                getContentPane().setBackground(Color.cyan);
                l.setText("Mouse Exited");
                l.setBackground(Color.cyan);
            }
            
}
public class Prog8swings {

    public static void main(String[] args) {
        swings1 s=new swings1();
    }
    
}
