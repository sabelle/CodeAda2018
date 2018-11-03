package com.company;
import java.awt.*;
import javax.swing.*;

public class Board extends JPanel {
    public static final Color BLUE = new Color(206, 236, 244);
    public static final Color PURPLE = new Color(241, 216, 246);
    public static final Color PINK = new Color(254, 224, 234);
    public static final Color WHITE = new Color(255, 255, 255);
    public static final Color[] COLORS = {BLUE, BLUE, PURPLE, PINK, WHITE};

    public static final Color ORANGE = new Color(233, 157, 63);
    public static final Color PALE_ORANGE = new Color(229, 173, 64);
    public static final Color YELLOW = new Color(238, 196, 62);
    public static final Color BLACK = new Color(49, 47, 24);
    public static final Color[] HONEYCOMB = {ORANGE, PALE_ORANGE, YELLOW, BLACK};

    public Board() {
        repaint();
    }
    public void paint(Graphics g) {
        for (int x = 100; x < 600; x+=50) {
            for (int y = 50; y < 600; y+=50) {
                int color = (int)(Math.random() * 4 + 1);
                g.setColor(COLORS[color]);
                g.fillRect(x, y, 50, 50);
            }
        }
    }
    public void paintHoney(Graphics g) {
        for (int x = 100; x < 600; x+=50) {
            for (int y = 50; y < 600; y+=50) {
                int color = (int)(Math.random() * 4 + 1);
                g.setColor(HONEYCOMB[color]);
                g.fillRect(x, y, 50, 50);
            }
        }
    }
}