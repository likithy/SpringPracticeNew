package com.practice.springframework;

import com.practice.springframework.game.*;

public class App01GamingBasic {
  public static void main(String[] args) {
    var game = new PacMan();// object creation
    var gameRunner = new GameRunner(game); // object creation and wiring of dependencies
    // game is a dependency of gamerunner
    // we are injecting game into gamerunner class
    gameRunner.run();
  }
}
