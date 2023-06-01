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
        ImageIcon icon = new ImageIcon("Pictures/Icon.png");

        setContentPane(panelBackGround);
        this.setSize(975, 690);
        this.setTitle("A Test of Memory!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        playButton.addActionListener(this);
        playButton.setText("Play");

        instructionButton.addActionListener(this);
        instructionButton.setText("Game Rules");


        label1.setIcon(image);
        this.setIconImage(icon.getImage());

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
