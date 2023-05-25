import javax.swing.*;

public class Level3 extends JFrame{
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
    private ImageIcon pluto;
    private ImageIcon comets;
    private ImageIcon asteroids;
    private ImageIcon meteorite;
    private ImageIcon telescope;
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
    private JLabel label21;
    private JLabel label22;
    private JLabel label23;
    private JLabel label24;
    private JLabel label25;
    private JLabel label26;
    private JLabel label27;
    private JLabel label28;
    private JLabel label29;
    private JLabel label30;
    private JPanel panel;

    public Level3(){
        cardBack = new ImageIcon("Pictures/cardBack.png");
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
        pluto = new ImageIcon("Pictures/Pluto.png");
        comets = new ImageIcon("Pictures/Comets.png");
        asteroids = new ImageIcon("Pictures/Asteroids.png");
        meteorite = new ImageIcon("Pictures/Meteorite.png");
        telescope = new ImageIcon("Pictures/Telescope.png");

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
        CardMatch plutoCard = new CardMatch(pluto, cardBack);
        CardMatch cometCard = new CardMatch(comets, cardBack);
        CardMatch asteroidCard = new CardMatch(asteroids, cardBack);
        CardMatch meteoriteCard = new CardMatch(meteorite, cardBack);
        CardMatch telescopeCard = new CardMatch(telescope, cardBack);

        setContentPane(panel);

        label1.setIcon(venusCard.getBack());
        label1.setText("");

        label2.setIcon(venusCard.getBack());
        label2.setText("");

        label3.setIcon(uranusCard.getBack());
        label3.setText("");

        label4.setIcon(mercuryCard.getBack());
        label4.setText("");

        label5.setIcon(earthCard.getBack());
        label5.setText("");

        label6.setIcon(sunCard.getBack());
        label6.setText("");

        label7.setIcon(neptuneCard.getBack());
        label7.setText("");

        label8.setIcon(jupiterCard.getBack());
        label8.setText("");

        label9.setIcon(cometCard.getBack());
        label9.setText("");

        label10.setIcon(neptuneCard.getBack());
        label10.setText("");

        label11.setIcon(asteroidCard.getBack());
        label11.setText("");

        label12.setIcon(moonCard.getBack());
        label12.setText("");

        label13.setIcon(plutoCard.getBack());
        label13.setText("");

        label14.setIcon(jupiterCard.getBack());
        label14.setText("");

        label15.setIcon(saturnCard.getBack());
        label15.setText("");

        label16.setIcon(plutoCard.getBack());
        label16.setText("");

        label17.setIcon(cometCard.getBack());
        label17.setText("");

        label18.setIcon(earthCard.getBack());
        label18.setText("");

        label19.setIcon(sunCard.getBack());
        label19.setText("");

        label20.setIcon(marsCard.getBack());
        label20.setText("");

        label21.setIcon(meteoriteCard.getBack());
        label21.setText("");

        label22.setIcon(saturnCard.getBack());
        label22.setText("");

        label23.setIcon(asteroidCard.getBack());
        label23.setText("");

        label24.setIcon(meteoriteCard.getBack());
        label24.setText("");

        label25.setIcon(moonCard.getBack());
        label25.setText("");

        label26.setIcon(telescopeCard.getBack());
        label26.setText("");

        label27.setIcon(telescopeCard.getBack());
        label27.setText("");

        label28.setIcon(mercuryCard.getBack());
        label28.setText("");

        label29.setIcon(uranusCard.getBack());
        label29.setText("");

        label30.setIcon(marsCard.getBack());
        label30.setText("");



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(730, 910);
        this.setResizable(false);
        this.setVisible(true);
    }
}
