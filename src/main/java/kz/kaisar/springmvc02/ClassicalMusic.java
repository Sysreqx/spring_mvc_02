package kz.kaisar.springmvc02;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    List<String> classicalMusicList = new ArrayList<String>();

    public ClassicalMusic() {
        classicalMusicList.add("Classical music #1");
        classicalMusicList.add("Classical music #2");
        classicalMusicList.add("Classical music #3");
    }

    @Override
    public String getSong() {
        return "Classical music";
    }

    public String getSong(int randNumber) {
        return classicalMusicList.get(randNumber);
    }

    public List<String> getSongs() {
        return classicalMusicList;
    }

}
