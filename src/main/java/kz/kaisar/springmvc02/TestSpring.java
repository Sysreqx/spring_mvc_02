package kz.kaisar.springmvc02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class TestSpring {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        Computer computer = context.getBean("computer", Computer.class);
//        computer.runMusicPlayer(MusicGenre.CLASSICAL);
//        computer.runMusicPlayer(MusicGenre.ROCK);

        System.out.println(computer.getMusicPlayer().getName());
        System.out.println(computer.getMusicPlayer().getVolume());

        context.close() ;
    }
}
