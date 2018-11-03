package com.company;
import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    public GameFrame() {
        this.setTitle("Flood It!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //add a canvas
        GamePanel panel = new GamePanel();

        this.add(panel, BorderLayout.SOUTH);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        GameFrame gameFrance = new GameFrame();
    }
}
