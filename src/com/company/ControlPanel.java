package com.company;
import javax.swing.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;

public class ControlPanel extends JPanel {
    private GameMain.GameCanvas canvas;
    private JButton blue;
    private JButton purple;
    private JButton pink;
    private JButton white;
    private JPanel panel;

    public ControlPanel(GameMain.GameCanvas canvas) {
        this.canvas = canvas;
        this.blue = new JButton("blue");
        this.add(this.blue);
        this.purple = new JButton("purple");
        this.add(this.purple);
        this.pink = new JButton("pink");
        this.add(this.pink);
        this.white = new JButton("white");
        this.add(this.white);

        this.panel = new JPanel();
        this.add(this.panel);
    }
}
