package kz.kaisar.springmvc02;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        RockMusic rockMusic  = context.getBean("musicBean", RockMusic.class);
//        ClassicalMusic classicalMusic  = context.getBean("classicalMusic", ClassicalMusic.class);
//        SpainMusic spainMusic  = context.getBean("spainMusic", SpainMusic.class);
//
//        List<Music> musicList = new ArrayList<>();
//        musicList.add(rockMusic);
//        musicList.add(classicalMusic);
//        musicList.add(spainMusic);
//
//        MusicPlayer musicPlayer = new MusicPlayer();
//        musicPlayer.setMusicList(musicList);
//        musicPlayer.playMusic();

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

        Computer computer = context.getBean("computer", Computer.class);
        computer.runMusicPlayer();

        context.close() ;
    }
}
