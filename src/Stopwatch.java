import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Stopwatch extends JFrame implements ActionListener{
    private JPanel panel1;
    private JLabel label1;
    private JButton button1;
    private JButton button2;
    private int elapsedTime = 0;
    private int seconds = 0;
    private int minutes = 0;
    private int hours = 0;
    private boolean started = false;
    private String seconds_string = String.format("%02d", seconds);
    private String minutes_string = String.format("%02d", minutes);
    private String hours_string = String.format("%02d", hours);

    Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            elapsedTime += 1000;
            hours = (elapsedTime / 3600000);
            minutes = (elapsedTime / 60000) % 60;
            seconds = (elapsedTime / 1000) % 60;
            seconds_string = String.format("%02d", seconds);
            minutes_string = String.format("%02d", minutes);
            hours_string = String.format("%02d", hours);
            label1.setText(hours_string + ":" + minutes_string + ":" + seconds_string);
        }
    });

    public Stopwatch(){
        label1.setText(hours_string + ":" + minutes_string + ":" + seconds_string);
        label1.setFont(new Font("Verdana", Font.PLAIN, 90));
        label1.setHorizontalAlignment(JTextField.CENTER);


        button1.setText("START");
        button1.addActionListener(this);
        button2.setText("RESET");
        button2.addActionListener(this);

        setContentPane(panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 180);
        this.setResizable(false);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1){
            if (started == false){
                started = true;
                button1.setText("STOP");
                start();
            }
            else {
                started = false;
                button1.setText("START");
                stop();
            }
        }
        if (e.getSource() == button2){
            started = false;
            button1.setText("START");
            reset();
        }
    }

    public void start(){
        timer.start();
    }

    public void stop(){
        timer.stop();
    }

    public void reset(){
        timer.stop();
        elapsedTime = 0;
        seconds = 0;
        minutes = 0;
        hours = 0;
        seconds_string = String.format("%02d", seconds);
        minutes_string = String.format("%02d", minutes);
        hours_string = String.format("%02d", hours);
        label1.setText(hours_string + ":" + minutes_string + ":" + seconds_string);
    }
}
