import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.*;


public class MyFrame extends JFrame {

    MyFrame(){

        JLabel label = new JLabel(); //create a label

        ImageIcon icon = new ImageIcon("Pictures/Icon.png"); //creates an image icon
        this.setIconImage(icon.getImage()); //change icon of frame

        ImageIcon image = new ImageIcon("Pictures/galaxy.png"); //creates image of galaxy
        label.setIcon(image); //show image of galaxy

        //manipulates the label
        label.setText("Welcome to CardMatching Game!"); //set text of label
        label.setHorizontalTextPosition(JLabel.CENTER); //set horizontal position of text: RIGHT, CENTER, LEFT
        label.setVerticalTextPosition(JLabel.TOP); //set vertical position of text: TOP, CENTER, BOTTOM
        label.setForeground(Color.WHITE); //set color of text
        label.setFont(new Font("MV Boli", Font.PLAIN, 30)); //set font and size of text
        label.setIconTextGap(-200); //makes the text move up



        this.setTitle("A Test of Memory!"); //sets the title of the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits the frame when close
        this.setSize(975, 657); //sets the x and y dimensions of the frame
        this.setLocation(450, 150); //set location of frame
        this.setResizable(false); //prevent frame from resize with mouse
        this.add(label); //add label to frame


        this.setVisible(true); //makes the frame visible








    }
}
