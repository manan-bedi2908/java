/*  Manan Bedi B.Sc(1) 19535 */
package Program_12b;
import java.awt.*;
import java.awt.event.*;

public class Program_12b extends Frame implements ActionListener{
    
    Button A,B;
    TextArea T;
    
    Program_12b()
    {
        T = new TextArea();
        T.setBounds(50, 190, 300, 100);
        setSize(400,500);
        setVisible(true);
        
        A = new Button("Personal Information");
        B = new Button("CGPA");
        A.setBounds(50,100,140,50);
        B.setBounds(210,100,140,50);
        
        add(A);
        add(B);
        setLayout(null);
        add(T);
        
        A.addActionListener(this);
        B.addActionListener(this);
        
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }        
    public static void main(String[] args) {
        Program_12b obj;
        obj = new Program_12b();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==A){
            setBackground(Color.yellow);
            T.setText("Name: Manan Bedi \nCourse: B.Sc (Hons) Computer Science \nRoll No:19535 \nCollege: SSCBS, DU");
            T.setBackground(Color.yellow);
        }
        else if(e.getSource()==B){
            setBackground(Color.green);
            T.setText("CGPA in previous semestar: 9.73");
            T.setBackground(Color.green);
        }       
    }
}
