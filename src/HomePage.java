import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends JFrame implements ActionListener {
    private JPanel panelBackGround;
    private JButton playButton;
    private JButton instructionButton;
    private JLabel label1;

    HomePage(){
        ImageIcon image = new ImageIcon("Pictures/Galaxy.png");
        ImageIcon icon = new ImageIcon("Pictures/Icon.png"); //creates an image icon

        setContentPane(panelBackGround);
        this.setSize(975, 690); //sets the x and y dimensions of the frame
        this.setTitle("A Test of Memory!"); //sets the title of the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        playButton.setSize(100, 40);
        instructionButton.setSize(100, 40);

/*


        //manipulates the label
        label1.setText("Welcome to CardMatching Game!"); //set text of label
        label1.setHorizontalTextPosition(JLabel.CENTER); //set horizontal position of text: RIGHT, CENTER, LEFT
        label1.setVerticalTextPosition(JLabel.TOP); //set vertical position of text: TOP, CENTER, BOTTOM
        label1.setForeground(Color.WHITE); //set color of text
        label1.setFont(new Font("MV Boli", Font.PLAIN, 30)); //set font and size of text
        label1.setIconTextGap(-200); //sets the gap between image and text

        this.setTitle("A Test of Memory!"); //sets the title of the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits the frame when close
        this.setSize(975, 657); //sets the x and y dimensions of the frame
        this.setLocation(450, 150); //set location of frame
        this.setResizable(false); //prevent frame from resize with mouse

        panelBackGround.add(label1);
        this.add(panelBackGround);
        this.add(playButton);*/

        //label2.setText("Welcome to CardMatching Game!"); //set text of label
        label1.setIcon(image); //show image of galaxy
        this.setIconImage(icon.getImage()); //change icon of frame

        this.setResizable(false);
        this.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
