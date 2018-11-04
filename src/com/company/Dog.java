package company;
import java.awt.Graphics;
import javax.swing.*;

public class Dog extends JPanel{

    private ImageIcon doge;

    public Dog(){
        doge = new ImageIcon("/images/doge.gif");
    }

    public void paintComponent(Graphics g){
        int x = 10;
        int y = 10;
        if(doge != null)
            doge.paintIcon(this, g, x, y);
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Dog window = new Dog();
                JFrame frame = new JFrame();
                frame.setBounds(100, 100, 220, 220);
                frame.setContentPane(window);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
