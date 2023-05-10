import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        /*JFrame frame = new JFrame(); //creates a frame
        frame.setTitle("Title goes here"); //sets the title of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits the frame when close
        frame.setSize(800, 650); //sets the x and y dimensions of the frame
        frame.setResizable(false); //prevent frame from resize with mouse
        frame.setVisible(true); //makes the frame visible
        JLabel label = new JLabel("I code"); //creates a label and set text, could also use the setText method
        frame.add(label);
        ImageIcon image1 = new ImageIcon("galaxy.jpg");
        label.setIcon(image1);
        label.setHorizontalTextPosition(JLabel.CENTER);

        //frame.getContentPane().setBackground(); //change background color

        ImageIcon image = new ImageIcon("Image1.jfif"); //creates an image icon
        frame.setIconImage(image.getImage()); //change icon of frame*/

        MyFrame frame = new MyFrame();
        //frame.getContentPane().add(new JPanelWithBackground("Pictures/galaxy.png"));



    }
}
