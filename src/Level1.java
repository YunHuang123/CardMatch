import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Level1 extends JFrame implements ActionListener {

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

    public Level1(){
        ImageIcon cardBack = new ImageIcon("Pictures/Cardback.png");
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


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(620, 590);
        this.setResizable(false);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1){
            button1.setIcon(sunCard.getFront());
        }
        if (e.getSource() == button2){
            button2.setIcon(moonCard.getFront());
        }
        if (e.getSource() == button3){
            button3.setIcon(sunCard.getFront());
        }
        if (e.getSource() == button4){
            button4.setIcon(meteoriteCard.getFront());
        }
        if (e.getSource() == button5){
            button5.setIcon(telescopeCard.getFront());
        }
        if (e.getSource() == button6){
            button6.setIcon(moonCard.getFront());
        }
        if (e.getSource() == button7){
            button7.setIcon(asteroidCard.getFront());
        }
        if (e.getSource() == button8){
            button8.setIcon(telescopeCard.getFront());
        }
        if (e.getSource() == button9){
            button9.setIcon(cometCard.getFront());
        }
        if (e.getSource() == button10){
            button10.setIcon(asteroidCard.getFront());
        }
        if (e.getSource() == button11){
            button11.setIcon(meteoriteCard.getFront());
        }
        if (e.getSource() == button12){
            button12.setIcon(cometCard.getFront());
        }
    }
}
