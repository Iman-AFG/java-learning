import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Board extends JFrame {
    public static final int Height = 500;
    public static final int  Width = 500;

    ImageIcon image = new ImageIcon("unnamed.jpg"); // create an imageIcon
    JLabel Label = new JLabel(); //create a label
          
    // Jframe = a GUI window to add components to 
    Board() {
        
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);  // exite out of application
        this.setTitle("JFrame title goes here");  //set title of frame
        this.setSize(Width,Height);  // set the x-dimension, and y-dimension of frame
        this.setVisible(true);  // set frame visible
        this.setResizable(false); //prevent frame from being resized
        this.setIconImage(image.getImage()); //change icon of frame
        this.getContentPane().setBackground(new Color(0xFF833F));//change color of background
        
        this.add(Label);

        

        
                 
    }

    

    
}  
