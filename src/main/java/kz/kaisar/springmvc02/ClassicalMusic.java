package kz.kaisar.springmvc02;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
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

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing classical music doMyInit()");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing classical music doMyDestroy()");
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
