import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyFrame extends JFrame implements ActionListener {

    MyFrame(){

        JLabel label = new JLabel(); //create a label

        //manipulates the label
        label.setText("Welcome to CardMatching Game!"); //set text of label
        label.setHorizontalTextPosition(JLabel.CENTER); //set horizontal position of text: RIGHT, CENTER, LEFT
        label.setVerticalTextPosition(JLabel.TOP); //set vertical position of text: TOP, CENTER, BOTTOM
        label.setForeground(Color.WHITE); //set color of text
        label.setFont(new Font("MV Boli", Font.PLAIN, 30)); //set font and size of text
        label.setIconTextGap(-200); //sets the gap between image and text

        ImageIcon icon = new ImageIcon("Pictures/Icon.png"); //creates an image icon
        this.setIconImage(icon.getImage()); //change icon of frame

        ImageIcon image = new ImageIcon("Pictures/galaxy.png"); //creates image of galaxy
        label.setIcon(image); //show image of galaxy

        JButton playButton = new JButton(); //creates the play button
        playButton.setBounds(0, 0, 10, 3); //sets the size and location of the play button
        playButton.setHorizontalAlignment(JButton.CENTER);
        playButton.setVerticalAlignment(JButton.CENTER);



        this.setTitle("A Test of Memory!"); //sets the title of the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits the frame when close
        this.setSize(975, 657); //sets the x and y dimensions of the frame
        this.setLocation(450, 150); //set location of frame
        this.setResizable(false); //prevent frame from resize with mouse
        this.add(label); //add label to frame
        this.add(playButton); //adds the play button to the frame


        this.setVisible(true); //makes the frame visible

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
