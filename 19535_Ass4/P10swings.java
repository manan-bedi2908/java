/* Manan Bedi B.Sc(1) 19535) */

package p10swings;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class buttondemo extends JFrame implements ActionListener{
    JButton b1=new JButton("RED");
    JButton b2=new JButton("BLUE");
    
    buttondemo(){
        getContentPane().setBackground(Color.DARK_GRAY);
        b1.setBackground(Color.black);
        b2.setBackground(Color.black);
        b1.setForeground(Color.white);
        b2.setForeground(Color.white);
        setVisible(true);
        setSize(400,400);
        b1.setBounds(100,100,80,30);
        b2.setBounds(200, 100, 80, 30);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(b1);
        add(b2);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==b1)
            getContentPane().setBackground(Color.RED);
        else
            getContentPane().setBackground(Color.BLUE);
    }
}
public class P10swings {

    public static void main(String[] args) {
        buttondemo b=new buttondemo();
    }
    
}
