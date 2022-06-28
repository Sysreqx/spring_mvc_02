package kz.kaisar.springmvc02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    private List<Music> musicList = new ArrayList<>();

    private Music music1;
    private Music music2;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

//    @Autowired
//    public MusicPlayer(List<Music> musicList) {
//        this.musicList = musicList;
//    }

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public MusicPlayer() {
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

//    public void playMusic() {
//        for (Music music : musicList) {
//            System.out.println("\t\tPlaying" + music.getSong());
//        }
//    }

    public void playMusic(MusicGenre musicGenre) {
        int min = 1;
        int max = 3;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);

        if (musicGenre == MusicGenre.CLASSICAL)
            System.out.println("\t\tPlaying " + music1.getSong(i));
        else
            System.out.println("\t\tPlaying " + music2.getSong(i));
    }
}
