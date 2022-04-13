package com.tamutnu;

import javax.swing.*;

public class GameFrame extends JFrame {

    GameFrame(){
        this.add( new GamePanel());
        this.setTitle("Tutorial Snake Game By Bro code");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

}

