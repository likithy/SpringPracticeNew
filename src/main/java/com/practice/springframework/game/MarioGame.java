package com.practice.springframework.game;

public class MarioGame implements GamingConsole {
    public void up(){
        System.out.println("Mario UP");
    }
    public void down(){
        System.out.println("Mario DOWN");
    }
    public void left(){
        System.out.println("Mario LEFT");
    }
    public void right(){
        System.out.println("Mario RIGHT");
    }
}
