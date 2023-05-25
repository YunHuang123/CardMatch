import javax.swing.*;

public class Level2 extends JFrame{
    private ImageIcon cardBack;

    private ImageIcon sun;
    private ImageIcon moon;
    private ImageIcon mercury;
    private ImageIcon venus;
    private ImageIcon earth;

    private ImageIcon mars;
    private ImageIcon jupiter;
    private ImageIcon saturn;
    private ImageIcon uranus;
    private ImageIcon neptune;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JLabel label11;
    private JLabel label12;
    private JLabel label13;
    private JLabel label14;
    private JLabel label15;
    private JLabel label16;
    private JLabel label17;
    private JLabel label18;
    private JLabel label19;
    private JLabel label20;
    private JPanel panel;

    public Level2(){
        cardBack = new ImageIcon("Pictures/Cardback.png");
        sun = new ImageIcon("Pictures/Sun.png");
        moon = new ImageIcon("Pictures/Moon.png");
        mercury = new ImageIcon("Pictures/Mercury.png");
        venus = new ImageIcon("Pictures/Venus.png");
        earth = new ImageIcon("Pictures/Earth.png");
        mars = new ImageIcon("Pictures/Mars.png");
        jupiter = new ImageIcon("Pictures/Jupiter.png");
        saturn = new ImageIcon("Pictures/Saturn.png");
        uranus = new ImageIcon("Pictures/Uranus.png");
        neptune = new ImageIcon("Pictures/Neptune.png");
        
        CardMatch sunCard = new CardMatch(sun, cardBack);
        CardMatch moonCard = new CardMatch(moon, cardBack);
        CardMatch mercuryCard = new CardMatch(mercury, cardBack);
        CardMatch venusCard = new CardMatch(venus, cardBack);
        CardMatch earthCard = new CardMatch(earth, cardBack);
        CardMatch marsCard = new CardMatch(mars, cardBack);
        CardMatch jupiterCard = new CardMatch(jupiter, cardBack);
        CardMatch saturnCard = new CardMatch(saturn, cardBack);
        CardMatch uranusCard = new CardMatch(uranus, cardBack);
        CardMatch neptuneCard = new CardMatch(neptune, cardBack);

        setContentPane(panel);

        label1.setIcon(earthCard.getBack());
        label1.setText("");

        label2.setIcon(neptuneCard.getBack());
        label2.setText("");

        label3.setIcon(neptuneCard.getBack());
        label3.setText("");

        label4.setIcon(saturnCard.getBack());
        label4.setText("");

        label5.setIcon(marsCard.getBack());
        label5.setText("");

        label6.setIcon(sunCard.getBack());
        label6.setText("");

        label7.setIcon(venusCard.getBack());
        label7.setText("");

        label8.setIcon(mercuryCard.getBack());
        label8.setText("");

        label9.setIcon(sunCard.getBack());
        label9.setText("");

        label10.setIcon(moonCard.getBack());
        label10.setText("");

        label11.setIcon(uranusCard.getBack());
        label11.setText("");

        label12.setIcon(marsCard.getBack());
        label12.setText("");

        label13.setIcon(earthCard.getBack());
        label13.setText("");

        label14.setIcon(jupiterCard.getBack());
        label14.setText("");

        label15.setIcon(moonCard.getBack());
        label15.setText("");

        label16.setIcon(mercuryCard.getBack());
        label16.setText("");

        label17.setIcon(venusCard.getBack());
        label17.setText("");

        label18.setIcon(saturnCard.getBack());
        label18.setText("");

        label19.setIcon(uranusCard.getBack());
        label19.setText("");

        label20.setIcon(jupiterCard.getBack());
        label20.setText("");



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(605, 735);
        this.setResizable(false);
        this.setVisible(true);
    }
}
