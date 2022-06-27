package kz.kaisar.springmvc02;

public class SpainMusic implements Music{

    public void doMyInit() {
        System.out.println("Doing SpainMusic class initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing SpainMusic class destruction");
    }

    @Override
    public String getSong() {
        return "Spain Music";
    }
}
