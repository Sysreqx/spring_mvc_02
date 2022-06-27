package kz.kaisar.springmvc02;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ClassicalMusic classicalMusic = context.getBean("musicBean1", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("musicBean1", ClassicalMusic.class);
//        RockMusic rockMusic  = context.getBean("musicBean2", RockMusic.class);
//        SpainMusic spainMusic = context.getBean("musicBean3", SpainMusic.class);

        System.out.println(classicalMusic.getSong());
        System.out.println();


//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getVolume());
//        System.out.println(musicPlayer.getName());

        context.close() ;
    }
}
