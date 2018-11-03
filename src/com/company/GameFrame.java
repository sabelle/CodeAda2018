package com.company;
import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    private GameMain.GameCanvas canvas;
    public GameFrame() {
        this.setTitle("Flood It!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //add a canvas
        ControlPanel panel = new ControlPanel(canvas);
        HexPanel hexBoard = new HexPanel(canvas);

        this.add(panel, BorderLayout.SOUTH);
        this.add(hexBoard, BorderLayout.NORTH);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        GameFrame gameFrame = new GameFrame();
        Board newBoard = new Board();
        gameFrame.add(newBoard);
    }
}
