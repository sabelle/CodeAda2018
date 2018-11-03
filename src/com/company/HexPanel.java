package com.company;

import javax.swing.*;

public class HexPanel extends JPanel {
    private GameMain.GameCanvas canvas;
    private HexBoard board;
    public HexPanel(GameMain.GameCanvas canvas) {
        this.canvas = canvas;
        this.add(board);
    }
}
