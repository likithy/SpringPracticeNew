package com.practice.springframework;

import com.practice.springframework.game.GameRunner;
import com.practice.springframework.game.MarioGame;

public class AppGamingBasic {
    public static void main(String[] args){
        var marioGame= new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
