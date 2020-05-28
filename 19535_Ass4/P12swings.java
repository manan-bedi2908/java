/* Manan Bedi B.Sc(1) 19535) */
package p12swings;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class demo2 extends JFrame implements ActionListener{
    JTextArea t=new JTextArea();
    JButton b1=new JButton("Personal Information");
    JButton b2=new JButton("CGPA");
    demo2(){
        setVisible(true);
        setLayout(null);
        getContentPane().setBackground(Color.GREEN);
        t.setBounds(50,120,500,400);
        setTitle("INFORMATION");
        setSize(600,600);
        b1.setBackground(Color.black);
        b2.setBackground(Color.black);
        b1.setForeground(Color.white);
        b2.setForeground(Color.white);
        t.setBackground(Color.GREEN);
        b1.setBounds(50, 50, 200, 50);
        b2.setBounds(350, 50, 200, 50);
        add(b1);
        add(b2);
        add(t);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            getContentPane().setBackground(Color.GREEN);
            add(t);
            t.setBackground(Color.PINK);
            t.setText("Name: Manan Bedi \nCourse: B.Sc (H) Computer Science \nRoll No.: 19535 \nCollege: SSCBS, DU");
        }
        else
        {
            getContentPane().setBackground(Color.GREEN);
            add(t);
            t.setBackground(Color.orange);
            t.setText("CGPA: 9.73");
        }
    }
}
public class P12swings {

    public static void main(String[] args) {
        demo2 d=new demo2();
        JFrame f=new JFrame(); 
        f.setBackground(Color.black);
    }
    
}
