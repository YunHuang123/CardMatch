import javax.swing.*;
import java.awt.*;
import java.awt.Color;


public class MyFrame extends JFrame {

    MyFrame(){
        this.setTitle("Title goes here"); //sets the title of the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits the frame when close
        this.setSize(800, 650); //sets the x and y dimensions of the frame
        this.setResizable(false); //prevent frame from resize with mouse
        this.setVisible(true); //makes the frame visible

        ImageIcon image = new ImageIcon("Image1.jfif"); //creates an image icon
        this.setIconImage(image.getImage()); //change icon of frame
        this.getContentPane().setBackground(new Color(0x00a8e1)); //change background color


    }
}
