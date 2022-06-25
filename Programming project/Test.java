import java.net.URL;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class Test {
    public static void main(String[] args) throws Exception {
    URL imageLocation = new URL("http://horstmann.com/java4everyone/duke.gif");
    JOptionPane.showMessageDialog(null, "Hello!", "Have a Good Day",
     JOptionPane.PLAIN_MESSAGE, new
        ImageIcon(imageLocation));

    }
    
}
