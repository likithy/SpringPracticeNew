package com.practice.springframework;

import com.practice.springframework.game.GameRunner;
import com.practice.springframework.game.MarioGame;
import com.practice.springframework.game.SuperContraGame;

public class AppGamingBasic {
    public static void main(String[] args){
    var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
