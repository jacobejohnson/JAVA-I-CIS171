//Jacob Johnson
//Bullseye
import javax.swing.JComponent;
import javax.swing.JFrame;
 
 public class BullsEyeViewer
 {
    public static void main(String[] args)
    {
       JFrame frame = new JFrame();
 
       frame.setSize(225, 250);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
       JComponent component = new BullsEyeComponent();
       frame.add(component);
 
       frame.setVisible(true);
    }
}