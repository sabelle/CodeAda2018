package company;

import java.awt.*;
import javax.swing.*;
public class ImagePanel extends JPanel{

    private ImageIcon image;

    public ImagePanel(){
        Board testBoard = new Board();
        if (testBoard.isHoney == true) {
            ImageIcon bee = new ImageIcon("com/company/images/bee.gif");
        } else {
            ImageIcon bee = new ImageIcon("com/company/images/doge.gif");
        }

    }

    public void paintComponent(Graphics g){
        int x = 5;
        int y = 10;
        if(image != null)
            image.paintIcon(this, g, x, y);
    }

    public static void main(String[] args){
        ImagePanel window = new ImagePanel();
        window.setBounds(100, 100, 395, 355);
        window.setVisible(true);
    }
}