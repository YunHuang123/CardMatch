import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
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
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        playButton.addActionListener(this);
        playButton.setSize(100, 40);
        playButton.setText("Play");

        instructionButton.addActionListener(this);
        instructionButton.setSize(100, 40);
        instructionButton.setText("Game Rules");


        label1.setIcon(image); //show image of galaxy
        this.setIconImage(icon.getImage()); //change icon of frame

        this.setResizable(false);
        this.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == instructionButton){
            GameRule ruleWindow = new GameRule();
        }
        if (e.getSource() == playButton){
            LevelSelect levels = new LevelSelect();
            this.setVisible(false);
        }
    }
}
