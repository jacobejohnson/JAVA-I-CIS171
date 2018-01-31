//Jacob Johnson
//Bullseye
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

 public class BullsEyeComponent extends JComponent
 { 
    public void paintComponent(Graphics g)
    { 
    	g.setColor(Color.black);
        g.fillOval(17, 17, 165, 165);
        g.setColor(Color.white);
        g.fillOval(34, 34, 130, 130);
        g.setColor(Color.black);
        g.fillOval(51, 51, 95, 95);
        g.setColor(Color.white);
        g.fillOval(68, 68, 60, 60);
        g.setColor(Color.black);
        g.fillOval(85, 85, 25, 25);
    }
 }