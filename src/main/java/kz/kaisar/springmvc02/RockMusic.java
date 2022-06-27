package kz.kaisar.springmvc02;

import org.springframework.stereotype.Component;

@Component("musicBean")
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Rock music";
    }
}
