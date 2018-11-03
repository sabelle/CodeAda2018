package com.company;
import java.awt.*;
import javax.swing.*;

public class Board extends JPanel {
    public static final Color BLUE = new Color(206, 236, 244);
    public static final Color PURPLE = new Color(241, 216, 246);
    public static final Color PINK = new Color(254, 224, 234);
    public static final Color WHITE = new Color(255, 255, 255);
    public static final Color[] COLORS = {BLUE, PURPLE, PINK, WHITE};

    int color = (int)(Math.random() * 5 + 1);
    public Board() {
        repaint();
    }
    public void paint(Graphics g) {
        g.setColor(COLORS[color]);
        g.fillRect(100,100,50,50);
        g.setColor(COLORS[color]);
        g.fillRect(150,100,50,50);
        g.setColor(COLORS[color]);
        g.fillRect(200,100,50,50);
    }
}