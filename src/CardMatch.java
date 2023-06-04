import javax.swing.*;
import java.util.Arrays;
public class CardMatch {
    private ImageIcon front;
    private ImageIcon back;


    public CardMatch(ImageIcon f, ImageIcon b){
        front = f;
        back = b;
    }
    public ImageIcon getFront() {
        return front;
    }

    public ImageIcon getBack() {
        return back;
    }



}
