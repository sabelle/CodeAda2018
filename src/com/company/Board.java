package com.company;
import java.awt.*;
import javax.swing.*;

public class Board extends JPanel {
    public static final Color BLUE = new Color(206, 236, 244);
    public static final Color PURPLE = new Color(241, 216, 246);
    public static final Color PINK = new Color(254, 224, 234);
    public static final Color WHITE = new Color(255, 255, 255);
    public static final Color[] COLORS = {BLUE, PURPLE, PINK, WHITE};

    public Board() {
        repaint();
    }
    public void paint(Graphics g) {
        int color = (int)(Math.random() * 3 + 1);
        g.setColor(COLORS[color]);
        g.fillRect(100,100,50,50);
        color = (int)(Math.random() * 3 + 1);
        g.setColor(COLORS[color]);
        g.fillRect(150,100,50,50);
        color = (int)(Math.random() * 3 + 1);
        g.setColor(COLORS[color]);
        g.fillRect(200,100,50,50);


        for (int x = 100; x < 600; x+=50) {
            for (int y = 100; y < 600; y+=50) {
                color = (int)(Math.random() * 3 + 1);
                g.setColor(COLORS[color]);
                g.fillRect(x, y, 50, 50);
            }
        }
    }
}