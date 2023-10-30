package com.practice.springframework;

import com.practice.springframework.game.GameRunner;
import com.practice.springframework.game.GamingConsole;
import com.practice.springframework.game.MarioGame;
import com.practice.springframework.game.PacMan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GamingConfiguration {
    @Bean
    @Primary
    public GamingConsole PacmanGame(){
        return  new PacMan();
    }

    @Bean
    @Qualifier("MarioGame")
    public GamingConsole MarioGame(){
    return new MarioGame();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        return new GameRunner(game);
    }
}
