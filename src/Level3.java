import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Level3 extends JFrame implements ActionListener {
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
    private CardMatch plutoCard;
    private CardMatch cometCard;
    private CardMatch asteroidCard;
    private CardMatch meteoriteCard;
    private CardMatch telescopeCard;
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
    private JButton button21;
    private JButton button22;
    private JButton button23;
    private JButton button24;
    private JButton button25;
    private JButton button26;
    private JButton button27;
    private JButton button28;
    private JButton button29;
    private JButton button30;

    public Level3(){
        ImageIcon cardBack = new ImageIcon("Pictures/cardBack.png");
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
        ImageIcon pluto = new ImageIcon("Pictures/Pluto.png");
        ImageIcon comets = new ImageIcon("Pictures/Comets.png");
        ImageIcon asteroids = new ImageIcon("Pictures/Asteroids.png");
        ImageIcon meteorite = new ImageIcon("Pictures/Meteorite.png");
        ImageIcon telescope = new ImageIcon("Pictures/Telescope.png");

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
        plutoCard = new CardMatch(pluto, cardBack);
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
        button13.addActionListener(this);
        button14.addActionListener(this);
        button15.addActionListener(this);
        button16.addActionListener(this);
        button17.addActionListener(this);
        button18.addActionListener(this);
        button19.addActionListener(this);
        button20.addActionListener(this);
        button21.addActionListener(this);
        button22.addActionListener(this);
        button23.addActionListener(this);
        button24.addActionListener(this);
        button25.addActionListener(this);
        button26.addActionListener(this);
        button27.addActionListener(this);
        button28.addActionListener(this);
        button29.addActionListener(this);
        button30.addActionListener(this);

        setContentPane(panel);

        button1.setIcon(venusCard.getBack());
        button1.setText("");

        button2.setIcon(venusCard.getBack());
        button2.setText("");

        button3.setIcon(uranusCard.getBack());
        button3.setText("");

        button4.setIcon(mercuryCard.getBack());
        button4.setText("");

        button5.setIcon(earthCard.getBack());
        button5.setText("");

        button6.setIcon(sunCard.getBack());
        button6.setText("");

        button7.setIcon(neptuneCard.getBack());
        button7.setText("");

        button8.setIcon(jupiterCard.getBack());
        button8.setText("");

        button9.setIcon(cometCard.getBack());
        button9.setText("");

        button10.setIcon(neptuneCard.getBack());
        button10.setText("");

        button11.setIcon(asteroidCard.getBack());
        button11.setText("");

        button12.setIcon(moonCard.getBack());
        button12.setText("");

        button13.setIcon(plutoCard.getBack());
        button13.setText("");

        button14.setIcon(jupiterCard.getBack());
        button14.setText("");

        button15.setIcon(saturnCard.getBack());
        button15.setText("");

        button16.setIcon(plutoCard.getBack());
        button16.setText("");

        button17.setIcon(cometCard.getBack());
        button17.setText("");

        button18.setIcon(earthCard.getBack());
        button18.setText("");

        button19.setIcon(sunCard.getBack());
        button19.setText("");

        button20.setIcon(marsCard.getBack());
        button20.setText("");

        button21.setIcon(meteoriteCard.getBack());
        button21.setText("");

        button22.setIcon(saturnCard.getBack());
        button22.setText("");

        button23.setIcon(asteroidCard.getBack());
        button23.setText("");

        button24.setIcon(meteoriteCard.getBack());
        button24.setText("");

        button25.setIcon(moonCard.getBack());
        button25.setText("");

        button26.setIcon(telescopeCard.getBack());
        button26.setText("");

        button27.setIcon(telescopeCard.getBack());
        button27.setText("");

        button28.setIcon(mercuryCard.getBack());
        button28.setText("");

        button29.setIcon(uranusCard.getBack());
        button29.setText("");

        button30.setIcon(marsCard.getBack());
        button30.setText("");



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(925, 960);
        this.setResizable(false);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1){
            button1.setIcon(venusCard.getFront());
        }
        if (e.getSource() == button2){
            button2.setIcon(venusCard.getFront());
        }
        if (e.getSource() == button3){
            button3.setIcon(uranusCard.getFront());
        }
        if (e.getSource() == button4){
            button4.setIcon(mercuryCard.getFront());
        }
        if (e.getSource() == button5){
            button5.setIcon(earthCard.getFront());
        }
        if (e.getSource() == button6){
            button6.setIcon(sunCard.getFront());
        }
        if (e.getSource() == button7){
            button7.setIcon(neptuneCard.getFront());
        }
        if (e.getSource() == button8){
            button8.setIcon(jupiterCard.getFront());
        }
        if (e.getSource() == button9){
            button9.setIcon(cometCard.getFront());
        }
        if (e.getSource() == button10){
            button10.setIcon(neptuneCard.getFront());
        }
        if (e.getSource() == button11){
            button11.setIcon(asteroidCard.getFront());
        }
        if (e.getSource() == button12){
            button12.setIcon(moonCard.getFront());
        }
        if (e.getSource() == button13){
            button13.setIcon(plutoCard.getFront());
        }
        if (e.getSource() == button14){
            button14.setIcon(jupiterCard.getFront());
        }
        if (e.getSource() == button15){
            button15.setIcon(saturnCard.getFront());
        }
        if (e.getSource() == button16){
            button16.setIcon(plutoCard.getFront());
        }
        if (e.getSource() == button17){
            button17.setIcon(cometCard.getFront());
        }
        if (e.getSource() == button18){
            button18.setIcon(earthCard.getFront());
        }
        if (e.getSource() == button19){
            button19.setIcon(sunCard.getFront());
        }
        if (e.getSource() == button20){
            button20.setIcon(marsCard.getFront());
        }
        if (e.getSource() == button21){
            button21.setIcon(meteoriteCard.getFront());
        }
        if (e.getSource() == button22){
            button22.setIcon(saturnCard.getFront());
        }
        if (e.getSource() == button23){
            button23.setIcon(asteroidCard.getFront());
        }
        if (e.getSource() == button24){
            button24.setIcon(meteoriteCard.getFront());
        }
        if (e.getSource() == button25){
            button25.setIcon(moonCard.getFront());
        }
        if (e.getSource() == button26){
            button26.setIcon(telescopeCard.getFront());
        }
        if (e.getSource() == button27){
            button27.setIcon(telescopeCard.getFront());
        }
        if (e.getSource() == button28){
            button28.setIcon(mercuryCard.getFront());
        }
        if (e.getSource() == button29){
            button29.setIcon(uranusCard.getFront());
        }
        if (e.getSource() == button30){
            button30.setIcon(marsCard.getFront());
        }
    }
}
