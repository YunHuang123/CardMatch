import javax.swing.*;


public class Level1 extends JFrame{
    private ImageIcon cardBack;

    private ImageIcon sun;
    private ImageIcon moon;
    private ImageIcon comets;
    private ImageIcon asteroids;
    private ImageIcon meteorite;
    private ImageIcon telescope;
    private JPanel panel1;
    private JPanel panel;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JPanel panel6;
    private JPanel panel7;
    private JPanel panel8;
    private JPanel panel9;
    private JPanel panel10;
    private JPanel panel11;
    private JPanel panel12;
    private JLabel label;
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

    public Level1(){
        cardBack = new ImageIcon("Pictures/cardBack.png");
        sun = new ImageIcon("Pictures/Sun.png");
        moon = new ImageIcon("Pictures/Moon.png");
        comets = new ImageIcon("Pictures/Comets.png");
        asteroids = new ImageIcon("Pictures/Asteroids.png");
        meteorite = new ImageIcon("Pictures/Meteorite.png");
        telescope = new ImageIcon("Pictures/Telescope.png");

        CardMatch sunCard = new CardMatch(sun, cardBack);
        CardMatch moonCard = new CardMatch(moon, cardBack);
        CardMatch cometCard = new CardMatch(comets, cardBack);
        CardMatch asteroidCard = new CardMatch(asteroids, cardBack);
        CardMatch meteoriteCard = new CardMatch(meteorite, cardBack);
        CardMatch telescopeCard = new CardMatch(telescope, cardBack);


        setContentPane(panel1);


        label.setIcon(sunCard.getBack());
        label.setText("");

        label2.setIcon(moonCard.getBack());
        label2.setText("");

        label3.setIcon(sunCard.getBack());
        label3.setText("");

        label4.setIcon(meteoriteCard.getBack());
        label4.setText("");

        label5.setIcon(telescopeCard.getBack());
        label5.setText("");

        label6.setIcon(moonCard.getBack());
        label6.setText("");

        label7.setIcon(asteroidCard.getBack());
        label7.setText("");

        label8.setIcon(telescopeCard.getBack());
        label8.setText("");

        label9.setIcon(cometCard.getBack());
        label9.setText("");

        label10.setIcon(asteroidCard.getBack());
        label10.setText("");

        label11.setIcon(meteoriteCard.getBack());
        label11.setText("");

        label12.setIcon(cometCard.getBack());
        label12.setText("");


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(770, 950);
        this.setResizable(true);
        this.setVisible(true);
    }


}
