import javax.swing.*;

public class GameRule extends  JFrame{
    private JPanel panel1;
    private JLabel label;

    public GameRule(){
        ImageIcon rule = new ImageIcon("Pictures/Rule.png");
        label.setIcon(rule);

        setContentPane(panel1);

        this.setSize(715, 485);
        this.setResizable(false);
        this.setVisible(true);
    }
}
