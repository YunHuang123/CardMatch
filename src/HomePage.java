import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class HomePage extends JFrame implements ActionListener {

    HomePage(){

        ImageIcon icon = new ImageIcon("Pictures/Icon.png"); //creates an image icon
        this.setIconImage(icon.getImage()); //change icon of frame

        JLabel label = new JLabel(); //create a label


        JPanel buttonPanel = new JPanel();
        //buttonPanel.setBackground(Color.RED);
        //buttonPanel.setBounds(200, 100, 100, 200);

        JPanel backgroundPanel = new JPanel();
        backgroundPanel.setBounds(0, 0, 975, 657);

        //manipulates the label
        label.setText("Welcome to CardMatching Game!"); //set text of label
        label.setHorizontalTextPosition(JLabel.CENTER); //set horizontal position of text: RIGHT, CENTER, LEFT
        label.setVerticalTextPosition(JLabel.TOP); //set vertical position of text: TOP, CENTER, BOTTOM
        label.setForeground(Color.WHITE); //set color of text
        label.setFont(new Font("MV Boli", Font.PLAIN, 30)); //set font and size of text
        label.setIconTextGap(-200); //sets the gap between image and text

        ImageIcon image = new ImageIcon("Pictures/galaxy.png"); //creates image of galaxy
        label.setIcon(image); //show image of galaxy

        JButton playButton = new JButton(); //creates the play button
        playButton.setBounds(420, 300, 100, 50);



        this.setTitle("A Test of Memory!"); //sets the title of the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits the frame when close
        this.setSize(975, 657); //sets the x and y dimensions of the frame
        this.setLocation(450, 150); //set location of frame
        this.setResizable(false); //prevent frame from resize with mouse


        backgroundPanel.add(label); //add label to backgroundPanel which covers the whole frame
        this.add(backgroundPanel); //add backgroundPanel to the frame
        this.add(playButton); //adds the play button to the frame
        this.add(buttonPanel);


        this.setVisible(true); //makes the frame visible

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
