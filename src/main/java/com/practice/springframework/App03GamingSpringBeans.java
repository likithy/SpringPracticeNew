package com.practice.springframework;

import com.practice.springframework.game.GameRunner;
import com.practice.springframework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
  public static void main(String[] args) {
    try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
      context.getBean(GameRunner.class).run();
    }
  }
}
