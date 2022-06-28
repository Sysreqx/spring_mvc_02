package kz.kaisar.springmvc02HW;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("kz.kaisar.springmvc02HW")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean SpainMusic spainMusic() {
        return new SpainMusic();
    }

    @Bean List<Music> musicList() {
        List<Music> musicList = new ArrayList<>();
        musicList.add(classicalMusic());
        musicList.add(rockMusic());
        musicList.add(spainMusic());
        return musicList;
    }

    @Bean MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

    @Bean Computer computer() {
        return new Computer(musicPlayer());
    }
}
