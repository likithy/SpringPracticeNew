package com.practice.springframework.game;

public class PacMan implements GamingConsole {

  public void up() {
    System.out.println("Pacman UP");
  }

  public void down() {
    System.out.println("Pacman DOWN");
  }

  public void left() {
    System.out.println("Pacman LEFT");
  }

  public void right() {
    System.out.println("Pacman RIGHT");
  }
}
