/* Manan Bedi B.Sc(1) 19535) */

package p11swings;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class keydemo1 extends JFrame implements KeyListener{
    JLabel l=new JLabel();
    
    keydemo1(){
        
        setLayout(null);
        getContentPane().setBackground(Color.darkGray); 
        setVisible(true);
        setSize(500,500);
        l.setBounds(100,190,300,50);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(l);
        addKeyListener(this); 
    }
            @Override
            public void keyTyped(KeyEvent e) {
                getContentPane().setBackground(Color.black);
                l.setOpaque(true);
                l.setBackground(Color.pink);
                l.setText("Typed character is: \"" + e.getKeyChar() + "\"");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                getContentPane().setBackground(Color.black);
                l.setOpaque(true);
                l.setBackground(Color.cyan);
                l.setText("You have pressed a function key!");
            }
            @Override
            public void keyReleased(KeyEvent e) {
            }
}
public class P11swings {

    public static void main(String[] args) {
        keydemo1 k=new keydemo1();
    }
    
}
