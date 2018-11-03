package com.company;
import java.awt.*;
import javax.swing.*;

public class Board extends JPanel {
    public static final Color BLUE = new Color(206, 236, 244);
    public static final Color PURPLE = new Color(241, 216, 246);
    public static final Color PINK = new Color(254, 224, 234);
    public static final Color WHITE = new Color(255, 255, 255);
    public static final Color[] COLORS = {BLUE, BLUE, PURPLE, PINK, WHITE};

    public Board() {
        //repaint();
    }
    public void paint(Graphics g) {
        for (int x = 50; x < 600; x+=50) {
            for (int y = 50; y < 600; y+=50) {
                int color = (int)(Math.random() * 4 + 1);
                g.setColor(COLORS[color]);
                g.fillRect(x, y, 50, 50);
            }
        }
    }
}