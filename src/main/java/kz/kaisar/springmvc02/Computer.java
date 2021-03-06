package kz.kaisar.springmvc02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {

    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    public MusicPlayer getMusicPlayer() {
        return musicPlayer;
    }

    public void setMusicPlayer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public void runMusicPlayer(MusicGenre musicGenre) {
        System.out.println("Computer #" + id + " running music player");
        System.out.println("\tMusic player playing:");
        musicPlayer.playMusic(musicGenre);
    }

}


