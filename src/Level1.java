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


        setContentPane(panel1);
        label.setIcon(sunCard.getBack());
        label.setText("");

        label2.setIcon(moon);
        label2.setText("");



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(720, 900);
        this.setResizable(false);
        this.setVisible(true);
    }


}
