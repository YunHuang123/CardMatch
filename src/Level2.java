import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Level2 extends JFrame implements ActionListener {
    private ImageIcon cardBack;

    private CardMatch sunCard;
    private CardMatch moonCard;
    private CardMatch mercuryCard;
    private CardMatch venusCard;
    private CardMatch earthCard;

    private CardMatch marsCard;
    private CardMatch jupiterCard;
    private CardMatch saturnCard;
    private CardMatch uranusCard;
    private CardMatch neptuneCard;
    private JPanel panel;
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
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton button17;
    private JButton button18;
    private JButton button19;
    private JButton button20;
    private JButton resetButton;
    private JLabel label1;
    private boolean flipped;
    private JButton firstButton;
    private JButton secondButton;
    private int numAttempts;
    private int invisible;
    private Record record = new Record();

    public Level2(){
        flipped = false;
        firstButton = button1;
        secondButton = button1;
        numAttempts = 0;
        invisible = 0;

        cardBack = new ImageIcon("Pictures/Cardback.png");
        ImageIcon sun = new ImageIcon("Pictures/Sun.png");
        ImageIcon moon = new ImageIcon("Pictures/Moon.png");
        ImageIcon mercury = new ImageIcon("Pictures/Mercury.png");
        ImageIcon venus = new ImageIcon("Pictures/Venus.png");
        ImageIcon earth = new ImageIcon("Pictures/Earth.png");
        ImageIcon mars = new ImageIcon("Pictures/Mars.png");
        ImageIcon jupiter = new ImageIcon("Pictures/Jupiter.png");
        ImageIcon saturn = new ImageIcon("Pictures/Saturn.png");
        ImageIcon uranus = new ImageIcon("Pictures/Uranus.png");
        ImageIcon neptune = new ImageIcon("Pictures/Neptune.png");

        sunCard = new CardMatch(sun, cardBack);
        moonCard = new CardMatch(moon, cardBack);
        mercuryCard = new CardMatch(mercury, cardBack);
        venusCard = new CardMatch(venus, cardBack);
        earthCard = new CardMatch(earth, cardBack);
        marsCard = new CardMatch(mars, cardBack);
        jupiterCard = new CardMatch(jupiter, cardBack);
        saturnCard = new CardMatch(saturn, cardBack);
        uranusCard = new CardMatch(uranus, cardBack);
        neptuneCard = new CardMatch(neptune, cardBack);

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
        button13.addActionListener(this);
        button14.addActionListener(this);
        button15.addActionListener(this);
        button16.addActionListener(this);
        button17.addActionListener(this);
        button18.addActionListener(this);
        button19.addActionListener(this);
        button20.addActionListener(this);
        resetButton.addActionListener(this);

        setContentPane(panel);

        button1.setIcon(earthCard.getBack());
        button1.setText("");

        button2.setIcon(neptuneCard.getBack());
        button2.setText("");

        button3.setIcon(neptuneCard.getBack());
        button3.setText("");

        button4.setIcon(saturnCard.getBack());
        button4.setText("");

        button5.setIcon(marsCard.getBack());
        button5.setText("");

        button6.setIcon(sunCard.getBack());
        button6.setText("");

        button7.setIcon(venusCard.getBack());
        button7.setText("");

        button8.setIcon(mercuryCard.getBack());
        button8.setText("");

        button9.setIcon(sunCard.getBack());
        button9.setText("");

        button10.setIcon(moonCard.getBack());
        button10.setText("");

        button11.setIcon(uranusCard.getBack());
        button11.setText("");

        button12.setIcon(marsCard.getBack());
        button12.setText("");

        button13.setIcon(earthCard.getBack());
        button13.setText("");

        button14.setIcon(jupiterCard.getBack());
        button14.setText("");

        button15.setIcon(moonCard.getBack());
        button15.setText("");

        button16.setIcon(mercuryCard.getBack());
        button16.setText("");

        button17.setIcon(venusCard.getBack());
        button17.setText("");

        button18.setIcon(saturnCard.getBack());
        button18.setText("");

        button19.setIcon(uranusCard.getBack());
        button19.setText("");

        button20.setIcon(jupiterCard.getBack());
        button20.setText("");

        resetButton.setText("Double click to continue");
        resetButton.setHorizontalTextPosition(SwingConstants.CENTER);
        resetButton.setVerticalAlignment(SwingConstants.CENTER);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(775, 825);
        this.setLocation(420, 0);
        this.setResizable(false);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (flipped == false){
            if (e.getSource() == button1){
                button1.setIcon(earthCard.getFront());
                firstButton = button1;
            }
            if (e.getSource() == button2){
                button2.setIcon(neptuneCard.getFront());
                firstButton = button2;
            }
            if (e.getSource() == button3){
                button3.setIcon(neptuneCard.getFront());
                firstButton = button3;
            }
            if (e.getSource() == button4){
                button4.setIcon(saturnCard.getFront());
                firstButton = button4;
            }
            if (e.getSource() == button5){
                button5.setIcon(marsCard.getFront());
                firstButton = button5;
            }
            if (e.getSource() == button6){
                button6.setIcon(sunCard.getFront());
                firstButton = button6;
            }
            if (e.getSource() == button7){
                button7.setIcon(venusCard.getFront());
                firstButton = button7;
            }
            if (e.getSource() == button8){
                button8.setIcon(mercuryCard.getFront());
                firstButton = button8;
            }
            if (e.getSource() == button9){
                button9.setIcon(sunCard.getFront());
                firstButton = button9;
            }
            if (e.getSource() == button10){
                button10.setIcon(moonCard.getFront());
                firstButton = button10;
            }
            if (e.getSource() == button11){
                button11.setIcon(uranusCard.getFront());
                firstButton = button11;
            }
            if (e.getSource() == button12){
                button12.setIcon(marsCard.getFront());
                firstButton = button12;
            }
            if (e.getSource() == button13){
                button13.setIcon(earthCard.getFront());
                firstButton = button13;
            }
            if (e.getSource() == button14){
                button14.setIcon(jupiterCard.getFront());
                firstButton = button14;
            }
            if (e.getSource() == button15){
                button15.setIcon(moonCard.getFront());
                firstButton = button15;
            }
            if (e.getSource() == button16){
                button16.setIcon(mercuryCard.getFront());
                firstButton = button16;
            }
            if (e.getSource() == button17){
                button17.setIcon(venusCard.getFront());
                firstButton = button17;
            }
            if (e.getSource() == button18){
                button18.setIcon(saturnCard.getFront());
                firstButton = button18;
            }
            if (e.getSource() == button19){
                button19.setIcon(uranusCard.getFront());
                firstButton = button19;
            }
            if (e.getSource() == button20){
                button20.setIcon(jupiterCard.getFront());
                firstButton = button20;
            }
            flipped = true;
        }
        else{
            if (e.getSource() == button1){
                button1.setIcon(earthCard.getFront());
                secondButton = button1;
                disableButton(button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17, button18, button19, button20);
                firstButton.setEnabled(true);
            }
            if (e.getSource() == button2){
                button2.setIcon(neptuneCard.getFront());
                secondButton = button2;
                disableButton(button1, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17, button18, button19, button20);
                firstButton.setEnabled(true);
            }
            if (e.getSource() == button3){
                button3.setIcon(neptuneCard.getFront());
                secondButton = button3;
                disableButton(button2, button1, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17, button18, button19, button20);
                firstButton.setEnabled(true);
            }
            if (e.getSource() == button4){
                button4.setIcon(saturnCard.getFront());
                secondButton = button4;
                disableButton(button2, button3, button1, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17, button18, button19, button20);
                firstButton.setEnabled(true);
            }
            if (e.getSource() == button5){
                button5.setIcon(marsCard.getFront());
                secondButton = button5;
                disableButton(button2, button3, button4, button1, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17, button18, button19, button20);
                firstButton.setEnabled(true);
            }
            if (e.getSource() == button6){
                button6.setIcon(sunCard.getFront());
                secondButton = button6;
                disableButton(button2, button3, button4, button5, button1, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17, button18, button19, button20);
                firstButton.setEnabled(true);
            }
            if (e.getSource() == button7){
                button7.setIcon(venusCard.getFront());
                secondButton = button7;
                disableButton(button2, button3, button4, button5, button6, button1, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17, button18, button19, button20);
                firstButton.setEnabled(true);
            }
            if (e.getSource() == button8){
                button8.setIcon(mercuryCard.getFront());
                secondButton = button8;
                disableButton(button2, button3, button4, button5, button6, button7, button1, button9, button10, button11, button12, button13, button14, button15, button16, button17, button18, button19, button20);
                firstButton.setEnabled(true);
            }
            if (e.getSource() == button9){
                button9.setIcon(sunCard.getFront());
                secondButton = button9;
                disableButton(button2, button3, button4, button5, button6, button7, button8, button1, button10, button11, button12, button13, button14, button15, button16, button17, button18, button19, button20);
                firstButton.setEnabled(true);
            }
            if (e.getSource() == button10){
                button10.setIcon(moonCard.getFront());
                secondButton = button10;
                disableButton(button2, button3, button4, button5, button6, button7, button8, button9, button1, button11, button12, button13, button14, button15, button16, button17, button18, button19, button20);
                firstButton.setEnabled(true);
            }
            if (e.getSource() == button11){
                button11.setIcon(uranusCard.getFront());
                secondButton = button11;
                disableButton(button2, button3, button4, button5, button6, button7, button8, button9, button10, button1, button12, button13, button14, button15, button16, button17, button18, button19, button20);
                firstButton.setEnabled(true);
            }
            if (e.getSource() == button12){
                button12.setIcon(marsCard.getFront());
                secondButton = button12;
                disableButton(button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button1, button13, button14, button15, button16, button17, button18, button19, button20);
                firstButton.setEnabled(true);
            }
            if (e.getSource() == button13){
                button13.setIcon(earthCard.getFront());
                secondButton = button13;
                disableButton(button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button1, button14, button15, button16, button17, button18, button19, button20);
                firstButton.setEnabled(true);
            }
            if (e.getSource() == button14){
                button14.setIcon(jupiterCard.getFront());
                secondButton = button14;
                disableButton(button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button1, button15, button16, button17, button18, button19, button20);
                firstButton.setEnabled(true);
            }
            if (e.getSource() == button15){
                button15.setIcon(moonCard.getFront());
                secondButton = button15;
                disableButton(button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button1, button16, button17, button18, button19, button20);
                firstButton.setEnabled(true);
            }
            if (e.getSource() == button16){
                button16.setIcon(mercuryCard.getFront());
                secondButton = button16;
                disableButton(button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button1, button17, button18, button19, button20);
                firstButton.setEnabled(true);
            }
            if (e.getSource() == button17){
                button17.setIcon(venusCard.getFront());
                secondButton = button17;
                disableButton(button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button1, button18, button19, button20);
                firstButton.setEnabled(true);
            }
            if (e.getSource() == button18){
                button18.setIcon(saturnCard.getFront());
                secondButton = button18;
                disableButton(button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17, button1, button19, button20);
                firstButton.setEnabled(true);
            }
            if (e.getSource() == button19){
                button19.setIcon(uranusCard.getFront());
                secondButton = button19;
                disableButton(button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17, button18, button1, button20);
                firstButton.setEnabled(true);
            }
            if (e.getSource() == button20){
                button20.setIcon(jupiterCard.getFront());
                secondButton = button20;
                disableButton(button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17, button18, button19, button1);
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
                    button13.setEnabled(true);
                    button14.setEnabled(true);
                    button15.setEnabled(true);
                    button16.setEnabled(true);
                    button17.setEnabled(true);
                    button18.setEnabled(true);
                    button19.setEnabled(true);
                    button20.setEnabled(true);
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
                    button13.setEnabled(true);
                    button14.setEnabled(true);
                    button15.setEnabled(true);
                    button16.setEnabled(true);
                    button17.setEnabled(true);
                    button18.setEnabled(true);
                    button19.setEnabled(true);
                    button20.setEnabled(true);
                }
                numAttempts ++;
                label1.setText("Attempts: " + numAttempts);
                if (invisible == 10){
                    if (numAttempts < record.getRecord1()) {
                        record.setRecord2(numAttempts);
                        record.saveData();
                    }
                }
            }
        }
    }

    public void disableButton(JButton button1, JButton button2, JButton button3, JButton button4, JButton button5, JButton button6, JButton button7, JButton button8, JButton button9, JButton button10, JButton button11, JButton button12, JButton button13, JButton button14, JButton button15, JButton button16, JButton button17, JButton button18, JButton button19){
        button1.setEnabled(false);
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
        button13.setEnabled(false);
        button14.setEnabled(false);
        button15.setEnabled(false);
        button16.setEnabled(false);
        button17.setEnabled(false);
        button18.setEnabled(false);
        button19.setEnabled(false);
    }
}
