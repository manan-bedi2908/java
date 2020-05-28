/*  Manan Bedi B.Sc(1) 19535 */
package Program_10b;
import java.awt.*;
import java.awt.event.*;

public class Program_10b extends Frame implements ActionListener{

    Button rb,bb;
    Program_10b() {
        
        setTitle("Action Listener");
        setSize(400,500);
        setVisible(true);
        setLocation(400,400);
        
        rb = new Button("RED");
        bb = new Button();
        bb.setLabel("BLUE");
        rb.setBounds(110,200,70,70);
        bb.setBounds(200,200,70,70);
        
        add(rb);
        add(bb);
        setLayout(null);
                
        rb.addActionListener(this);
        bb.addActionListener(this);        
        
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    
    public static void main(String[] args) {
        Program_10b obj;
        obj = new Program_10b();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==rb)
            setBackground(Color.red);
        else if(e.getSource()==bb)
            setBackground(Color.blue);
    }
}
