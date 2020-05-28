/*
   Manan Bedi B.Sc(1) 19535
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mouseevents1;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author WINDOWS 10
 */
public abstract class MouseEvents1 extends Frame implements MouseListener {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Frame fr = new Frame("Mouse Listener");
        Label lb = new Label();
        fr.setSize(700,700);
        fr.setLocation(600,250);
        lb.setBounds(200,200,300,70);
        lb.setEnabled(false);
        fr.add(lb);
        fr.setLayout(null);
        fr.setVisible(true);
        fr.addMouseListener(new MouseListener() {
            int clicks = 0;
            @Override
            public void mouseClicked(MouseEvent me) {
                fr.setBackground(Color.GREEN);
                lb.setBackground(Color.GREEN);
                clicks = clicks + me.getClickCount();
                lb.setText("Mouse Clicked" + clicks + "times");
            }
            
            @Override
            public void mouseEntered(MouseEvent me) {
                fr.setVisible(true);
                lb.setText("Mouse Entered");
                fr.setBackground(Color.CYAN);
                lb.setBackground(Color.CYAN);
            }
              
            @Override
            public void mouseExited(MouseEvent me) {
                fr.setVisible(false);
                fr.dispose();
            }
              
            @Override
            public void mousePressed(MouseEvent me) {
                lb.setText("Mouse Pressed");
            }
              
            @Override
            public void mouseReleased(MouseEvent me) {
            }
        });
    }
    
}
