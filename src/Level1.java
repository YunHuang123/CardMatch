import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.text.AbstractDocument;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Level1 extends JFrame{
    static JLayeredPane EverythingButPlayer;
    private JFrame j;
    private JPanel panel1;
    private Image sun;
    private ImageIcon moon;

    private int x1;
    private int y1;

    public Level1(){
        EverythingButPlayer = new JLayeredPane();

        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("Pictures/Sun.png"));
        } catch (IOException e) {
        }
        Graphics g = img.getGraphics();
        g.drawImage(img,0, 0, EverythingButPlayer);

        this.add(EverythingButPlayer);

        x1 = 0;
        y1 = 0;
//        j = new JFrame();
//
//        this.addKeyListener(new KeyTracker());
//        j.add(new CustomPaintComponent());
//
//        String sunURL = "Pictures/Sun.png";
//        sun = Toolkit.getDefaultToolkit().getImage(sunURL);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(720, 900);
        this.setResizable(false);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Action performed!");
    }

    public class KeyTracker extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            j.repaint();
            int key = e.getKeyCode();
            if (key == KeyEvent.VK_A) {
                x1 = x1 - 10;
                j.repaint();
            }
            if (key == KeyEvent.VK_S) {
                y1 = y1 + 10;
                j.repaint();
            }
            if (key == KeyEvent.VK_D) {
                x1 = x1 + 10;
                j.repaint();
            }
            if (key == KeyEvent.VK_W) {
                y1 = y1 - 10;
                j.repaint();
            }
        }

    }


    public class CustomPaintComponent extends Component {

        public void paintSun(Graphics g) {
            System.out.println("Paint " + x1 + " " + y1);
            Graphics2D g2d = (Graphics2D)g;
            System.out.println(sun);
            g2d.drawImage(sun, x1, y1, null);
        }

    }
}
