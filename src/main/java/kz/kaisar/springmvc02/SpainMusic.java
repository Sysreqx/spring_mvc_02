package kz.kaisar.springmvc02;

import org.springframework.stereotype.Component;

@Component
public class SpainMusic implements Music{

//    public void doMyInit() {
//        System.out.println("Doing SpainMusic class initialization");
//    }
//
//    public void doMyDestroy() {
//        System.out.println("Doing SpainMusic class destruction");
//    }

    @Override
    public String getSong() {
        return "Spain Music";
    }

    @Override
    public String getSong(int randNumber) {
        return null;
    }
}
