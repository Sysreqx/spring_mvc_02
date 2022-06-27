package kz.kaisar.springmvc02;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{

    List<String> rockMusicList = new ArrayList<String>();

    public RockMusic() {
        rockMusicList.add("Rock music #1");
        rockMusicList.add("Rock music #2");
        rockMusicList.add("Rock music #3");
    }

    @Override
    public String getSong() {
        return "Rock music";
    }

    public String getSong(int randNumber) {
        return rockMusicList.get(randNumber);
    }

    public List<String> getSongs() {
        return rockMusicList;
    }
}
