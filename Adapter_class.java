/*  Manan Bedi B.Sc(1) 19535 */
package adapter_class;
import java.awt.*;
import java.awt.event.*;

public class Adapter_class extends Frame {
    String keymsg = "";
    
   public Adapter_class() {
       addKeyListener(new MyKeyAdapter(this));
       addWindowListener(new MyWindowAdapter());
   }
   @Override
   public void paint(Graphics g) {
       g.drawString(keymsg,10,40);
   }
   public static void main(String args[]) {
       Adapter_class adap = new Adapter_class();
       adap.setSize(new Dimension(600, 400));
       adap.setLocation(500,400);
       adap.setBackground(Color.BLUE);
       adap.setTitle("An AWT Based Application");
       adap.setVisible(true);
   }
}
class MyKeyAdapter extends KeyAdapter {
    Adapter_class adap;
    public MyKeyAdapter(Adapter_class adap) {
        this.adap = adap;
    }
    @Override
    public void keyTyped(KeyEvent ke) {
        adap.setTitle("The Key Typed is: " + ke.getKeyChar());
        adap.repaint();
    };
}

class MyWindowAdapter extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}
