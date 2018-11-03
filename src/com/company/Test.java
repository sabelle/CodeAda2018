package com.company;
import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        JFrame f = new JFrame("Squares");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Board newBoard = new Board();
        f.add(newBoard);
        f.setSize(400,500);
        f.setVisible(true);
    }
}
