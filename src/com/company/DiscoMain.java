package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DiscoMain extends JPanel {
    private static final int CANVAS_WIDTH = 700;
    private static final int CANVAS_HEIGHT = 700;
    private JButton ada;
    private JButton honeycomb;

    public DiscoMain() {
        GameCanvas canvas = new GameCanvas();
        ada = new JButton("Code Ada");
        honeycomb = new JButton("Honeycomb");
        canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
        this.add(canvas, BorderLayout.SOUTH);
        this.add(ada);
        this.add(honeycomb);
        this.setVisible(true);
    }

    public void gameDraw(Graphics2D g2d) {
        Board newBoard = new Board();
        if (ada.isEnabled()) {
            newBoard.paint(g2d);
        } else if (honeycomb.isEnabled()) {
            newBoard.paintHoney(g2d);
        }
    }

    class GameCanvas extends JPanel implements KeyListener {
        public GameCanvas() {
            setFocusable(true);  // so that this can receive key-events
            requestFocus();
            addKeyListener(this);
        }

        @Override
        public void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D)g;  // if using Java 2D
            super.paintComponent(g2d);       // paint background
            setBackground(Color.GRAY);      // may use an image for background

            gameDraw(g2d);
        }

        @Override
        public void keyPressed(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {
            int keyCode = e.getKeyCode();
            if (keyCode == KeyEvent.VK_SPACE) {
                revalidate();
                repaint();
            }
        }

        @Override
        public void keyTyped(KeyEvent e) { }     // not used
    }

    // main
    public static void main(String[] args) {
        // Use the event dispatch thread to build the UI for thread-safety.
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Board newBoard = new Board();
                JFrame frame = new JFrame("Disco in a Box!!");
                frame.add(newBoard);
                frame.setVisible(true);
                frame.setContentPane(new DiscoMain());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null); // center the application window
                frame.setVisible(true);            // show it
            }
        });
    }
}
