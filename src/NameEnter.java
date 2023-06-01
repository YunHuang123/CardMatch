import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NameEnter extends JFrame implements ActionListener {
    private JPanel panel1;
    private JTextField nameField;
    private JButton enterButton;

    public NameEnter(){

        enterButton.setText("ENTER");
        enterButton.addActionListener(this);

        nameField.setPreferredSize(new Dimension(250, 40));
        nameField.setFont(new Font("Consolas", Font.PLAIN, 35));
        nameField.setForeground(new Color(0x00FF00));
        nameField.setBackground(Color.BLACK);
        nameField.setCaretColor(Color.WHITE);
        nameField.setText("Username");


        setContentPane(panel1);

        this.setSize(400, 120);
        this.setResizable(true);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == enterButton){
            System.out.println("Welcome " + nameField.getText());
        }
    }
}
