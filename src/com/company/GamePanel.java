package com.company;
import javax.swing.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;

/**
 * Creates a new GUI window that contains HexBoard.
 */
public class GamePanel extends JPanel {
    private JButton color1;
    private JButton color2;
    private JButton color3;
    private JButton color4;
    private JPanel panel;

    public GamePanel() {
        this.color1 = new JButton("1");
        this.add(this.color1);
        this.color2 = new JButton("2");
        this.add(this.color2);
        this.color3 = new JButton("3");
        this.add(this.color3);
        this.color4 = new JButton("4");
        this.add(this.color4);

        this.panel = new JPanel();
        this.add(this.panel);

        this.panel.setBackground(Color.WHITE);

    }
}