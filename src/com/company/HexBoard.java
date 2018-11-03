package com.company;
import javafx.scene.shape.Shape;

import java.awt.Color;

public class HexBoard {
    private int width, height;
    private Color[][] board;

    public static final Color BLUE = new Color(206, 236, 244);
    public static final Color PURPLE = new Color(241, 216, 246);
    public static final Color PINK = new Color(254, 224, 234);
    public static final Color WHITE = new Color(255, 255, 255);
    public static final Color[] COLORS = {BLUE, PURPLE, PINK, WHITE};

    public HexBoard(){
        board = new Color[10][10];
        fillBoard(board);
    }

    public Color[][] fillBoard(Color[][] boardToFill) {
        for (Color[] row : boardToFill) {
            for (Color col : row) {
                int random = (int)(Math.random() * 4) + 1;
                col = COLORS[random];
            }
        }
        return boardToFill;
    }


}