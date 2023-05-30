import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LevelSelect extends JFrame implements ActionListener {
    private JPanel panel1;
    private JLabel label1;
    private JButton button1;
    private JButton button2;
    private JButton button3;

    public LevelSelect(){
        ImageIcon stars = new ImageIcon("Pictures/Stars.png");
        label1.setIcon(stars);
        label1.setText("");

        button1.setText("Level 1");
        button2.setText("Level 2");
        button3.setText("Level 3");

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        setContentPane(panel1);

        this.setSize(975, 690);
        this.setResizable(false);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1){
            Level1 level = new Level1();
            Stopwatch stopwatch = new Stopwatch();
            this.setVisible(false);
        }
        if (e.getSource() == button2){
            Level2 level = new Level2();
            Stopwatch stopwatch = new Stopwatch();
            this.setVisible(false);
        }
        if (e.getSource() == button3){
            Level3 level = new Level3();
            Stopwatch stopwatch = new Stopwatch();
            this.setVisible(false);
        }
    }
}
