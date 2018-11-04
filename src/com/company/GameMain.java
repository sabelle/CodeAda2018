package company;

//Claire Chiu, Sabelle Huang, Stacy Zeng, Sarah Zhou
//Code Ada 2018

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameMain extends JPanel {     // main class for the game
    // Define constants for the game
    private static final int CANVAS_WIDTH = 700;
    private static final int CANVAS_HEIGHT = 700;
    private GameCanvas canvas;

    public GameMain() {
        gameInit();

        GameCanvas canvas = new GameCanvas();
        ControlPanel panel = new ControlPanel(canvas);
        canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
        this.add(canvas, BorderLayout.SOUTH);
        this.add(panel, BorderLayout.NORTH);
        this.setVisible(true);
    }

    // Initialize all the game objects, run only once.
    public void gameInit() {
    }

    // Start and re-start the game.
    public void gameStart() {

    }

    // Shutdown the game, clean up code that runs only once.
    public void gameShutdown() {

    }

    // One step of the game.
    public void gameUpdate() {

    }

    // Refresh the display after each step.
    // Use (Graphics g) as argument if you are not using Java 2D.
    public void gameDraw(Graphics2D g2d) {
        Board newBoard = new Board();
        newBoard.paint(g2d);
    }

    // Process a key-pressed event.
    public void gameKeyPressed(KeyEvent e) {
    }

    // Other methods
    // ......

    // Custom drawing panel, written as an inner class.
    class GameCanvas extends JPanel implements KeyListener {
        // Constructor
        public GameCanvas() {
            setFocusable(true);  // so that this can receive key-events
            requestFocus();
            addKeyListener(this);
        }

        // Override paintComponent to do custom drawing.
        // Called back by repaint().
        @Override
        public void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D)g;  // if using Java 2D
            super.paintComponent(g2d);       // paint background
            setBackground(Color.GRAY);      // may use an image for background

            // Draw the game objects
            gameDraw(g2d);
        }

        // KeyEvent handlers
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            if (keyCode == KeyEvent.VK_H) {
                Board.isHoney = true;
                revalidate();
                repaint();
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            int keyCode = e.getKeyCode();
            if (keyCode == KeyEvent.VK_SPACE) {
                revalidate();
                repaint();
            }
        }  // not used

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
                JFrame frame = new JFrame("Flood It");
                frame.add(newBoard);
                frame.setVisible(true);
                // Set the content-pane of the JFrame to an instance of main JPanel
                frame.setContentPane(new GameMain());  // main JPanel as content pane
                //frame.setJMenuBar(menuBar);          // menu-bar (if defined)
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null); // center the application window
                frame.setVisible(true);            // show it

            }
        });
    }
}