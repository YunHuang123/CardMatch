import javax.swing.*;
public class Image extends JFrame{
    JFrame frame;
    JLabel displayField;
    ImageIcon image;

    public Image(){
        frame = new JFrame("Image Display Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try{
            image = new ImageIcon(getClass().getResource("universe.avif"));
            displayField = new JLabel(image);
            frame.add(displayField);
        }
        catch(Exception e){
            System.out.println("Cannot find image!!!");
        }
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Image i = new Image();
    }

}
