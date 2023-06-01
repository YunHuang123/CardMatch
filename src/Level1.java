import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Level1 extends JFrame implements ActionListener {
    private ImageIcon cardBack;
    private CardMatch sunCard;
    private CardMatch moonCard;
    private CardMatch cometCard;
    private CardMatch asteroidCard;
    private CardMatch meteoriteCard;
    private CardMatch telescopeCard;

    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton resetButton;
    private JLabel label1;
    private boolean flipped;
    private JButton firstButton;
    private JButton secondButton;
    private int numAttempts;
    private int invisible;
    private Record record = new Record();

    public Level1(){
        flipped = false;
        firstButton = button1;
        secondButton = button1;
        numAttempts = 0;
        invisible = 0;

        cardBack = new ImageIcon("Pictures/Cardback.png");
        ImageIcon sun = new ImageIcon("Pictures/Sun.png");
        ImageIcon moon = new ImageIcon("Pictures/Moon.png");
        ImageIcon comets = new ImageIcon("Pictures/Comets.png");
        ImageIcon asteroids = new ImageIcon("Pictures/Asteroids.png");
        ImageIcon meteorite = new ImageIcon("Pictures/Meteorite.png");
        ImageIcon telescope = new ImageIcon("Pictures/Telescope.png");

        sunCard = new CardMatch(sun, cardBack);
        moonCard = new CardMatch(moon, cardBack);
        cometCard = new CardMatch(comets, cardBack);
        asteroidCard = new CardMatch(asteroids, cardBack);
        meteoriteCard = new CardMatch(meteorite, cardBack);
        telescopeCard = new CardMatch(telescope, cardBack);

        label1.setText("Attempts: " + numAttempts);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button10.addActionListener(this);
        button11.addActionListener(this);
        button12.addActionListener(this);
        resetButton.addActionListener(this);

        setContentPane(panel1);


        button1.setIcon(sunCard.getBack());
        button1.setText("");

        button2.setIcon(moonCard.getBack());
        button2.setText("");

        button3.setIcon(sunCard.getBack());
        button3.setText("");

        button4.setIcon(meteoriteCard.getBack());
        button4.setText("");

        button5.setIcon(telescopeCard.getBack());
        button5.setText("");

        button6.setIcon(moonCard.getBack());
        button6.setText("");

        button7.setIcon(asteroidCard.getBack());
        button7.setText("");

        button8.setIcon(telescopeCard.getBack());
        button8.setText("");

        button9.setIcon(cometCard.getBack());
        button9.setText("");

        button10.setIcon(asteroidCard.getBack());
        button10.setText("");

        button11.setIcon(meteoriteCard.getBack());
        button11.setText("");

        button12.setIcon(cometCard.getBack());
        button12.setText("");

        resetButton.setText("Double click to continue");
        resetButton.setHorizontalTextPosition(SwingConstants.CENTER);
        resetButton.setVerticalAlignment(SwingConstants.CENTER);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(620, 630);
        this.setLocation(420, 0);
        this.setResizable(false);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (flipped == false){
            if (e.getSource() == button1){
                button1.setIcon(sunCard.getFront());
                firstButton = button1;
            }
            if (e.getSource() == button2){
                button2.setIcon(moonCard.getFront());
                firstButton = button2;
            }
            if (e.getSource() == button3){
                button3.setIcon(sunCard.getFront());
                firstButton = button3;
            }
            if (e.getSource() == button4){
                button4.setIcon(meteoriteCard.getFront());
                firstButton = button4;
            }
            if (e.getSource() == button5){
                button5.setIcon(telescopeCard.getFront());
                firstButton = button5;
            }
            if (e.getSource() == button6){
                button6.setIcon(moonCard.getFront());
                firstButton = button6;
            }
            if (e.getSource() == button7){
                button7.setIcon(asteroidCard.getFront());
                firstButton = button7;
            }
            if (e.getSource() == button8){
                button8.setIcon(telescopeCard.getFront());
                firstButton = button8;
            }
            if (e.getSource() == button9){
                button9.setIcon(cometCard.getFront());
                firstButton = button9;
            }
            if (e.getSource() == button10){
                button10.setIcon(asteroidCard.getFront());
                firstButton = button10;
            }
            if (e.getSource() == button11){
                button11.setIcon(meteoriteCard.getFront());
                firstButton = button11;
            }
            if (e.getSource() == button12){
                button12.setIcon(cometCard.getFront());
                firstButton = button12;
            }
            flipped = true;
        }
        else{
            if (e.getSource() == button1){
                button1.setIcon(sunCard.getFront());
                secondButton = button1;
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);
                button10.setEnabled(false);
                button11.setEnabled(false);
                button12.setEnabled(false);
                firstButton.setEnabled(true);
            }
            if (e.getSource() == button2){
                button2.setIcon(moonCard.getFront());
                secondButton = button2;
                button1.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);
                button10.setEnabled(false);
                button11.setEnabled(false);
                button12.setEnabled(false);
                firstButton.setEnabled(true);
            }
            if (e.getSource() == button3){
                button3.setIcon(sunCard.getFront());
                secondButton = button3;
                button2.setEnabled(false);
                button1.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);
                button10.setEnabled(false);
                button11.setEnabled(false);
                button12.setEnabled(false);
                firstButton.setEnabled(true);
            }
            if (e.getSource() == button4){
                button4.setIcon(meteoriteCard.getFront());
                secondButton = button4;
                button2.setEnabled(false);
                button3.setEnabled(false);
                button1.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);
                button10.setEnabled(false);
                button11.setEnabled(false);
                button12.setEnabled(false);
                firstButton.setEnabled(true);
            }
            if (e.getSource() == button5){
                button5.setIcon(telescopeCard.getFront());
                secondButton = button5;
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button1.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);
                button10.setEnabled(false);
                button11.setEnabled(false);
                button12.setEnabled(false);
                firstButton.setEnabled(true);
            }
            if (e.getSource() == button6){
                button6.setIcon(moonCard.getFront());
                secondButton = button6;
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button1.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);
                button10.setEnabled(false);
                button11.setEnabled(false);
                button12.setEnabled(false);
                firstButton.setEnabled(true);
            }
            if (e.getSource() == button7){
                button7.setIcon(asteroidCard.getFront());
                secondButton = button7;
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button1.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);
                button10.setEnabled(false);
                button11.setEnabled(false);
                button12.setEnabled(false);
                firstButton.setEnabled(true);
            }
            if (e.getSource() == button8){
                button8.setIcon(telescopeCard.getFront());
                secondButton = button8;
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button1.setEnabled(false);
                button9.setEnabled(false);
                button10.setEnabled(false);
                button11.setEnabled(false);
                button12.setEnabled(false);
                firstButton.setEnabled(true);
            }
            if (e.getSource() == button9){
                button9.setIcon(cometCard.getFront());
                secondButton = button9;
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button1.setEnabled(false);
                button10.setEnabled(false);
                button11.setEnabled(false);
                button12.setEnabled(false);
                firstButton.setEnabled(true);
            }
            if (e.getSource() == button10){
                button10.setIcon(asteroidCard.getFront());
                secondButton = button10;
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);
                button1.setEnabled(false);
                button11.setEnabled(false);
                button12.setEnabled(false);
                firstButton.setEnabled(true);
            }
            if (e.getSource() == button11){
                button11.setIcon(meteoriteCard.getFront());
                secondButton = button11;
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);
                button10.setEnabled(false);
                button1.setEnabled(false);
                button12.setEnabled(false);
                firstButton.setEnabled(true);
            }
            if (e.getSource() == button12){
                button12.setIcon(cometCard.getFront());
                secondButton = button12;
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button7.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);
                button10.setEnabled(false);
                button11.setEnabled(false);
                button1.setEnabled(false);
                firstButton.setEnabled(true);
            }
            flipped = false;
            if (e.getSource() == resetButton){
                if (firstButton.getIcon().toString().equals(secondButton.getIcon().toString())){
                    firstButton.setVisible(false);
                    secondButton.setVisible(false);
                    button1.setEnabled(true);
                    button2.setEnabled(true);
                    button3.setEnabled(true);
                    button4.setEnabled(true);
                    button5.setEnabled(true);
                    button6.setEnabled(true);
                    button7.setEnabled(true);
                    button8.setEnabled(true);
                    button9.setEnabled(true);
                    button10.setEnabled(true);
                    button11.setEnabled(true);
                    button12.setEnabled(true);
                    invisible ++;
                }
                else{
                    firstButton.setIcon(cardBack);
                    secondButton.setIcon(cardBack);
                    button1.setEnabled(true);
                    button2.setEnabled(true);
                    button3.setEnabled(true);
                    button4.setEnabled(true);
                    button5.setEnabled(true);
                    button6.setEnabled(true);
                    button7.setEnabled(true);
                    button8.setEnabled(true);
                    button9.setEnabled(true);
                    button10.setEnabled(true);
                    button11.setEnabled(true);
                    button12.setEnabled(true);
                }
                numAttempts ++;
                label1.setText("Attempts: " + numAttempts);
                if (invisible == 6){
                    if (numAttempts < record.getRecord1()){
                        record.setRecord1(numAttempts);
                        record.saveData();
                    }
                }
            }
        }
    }



}
