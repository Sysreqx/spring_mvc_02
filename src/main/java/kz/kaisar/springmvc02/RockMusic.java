package kz.kaisar.springmvc02;

public class RockMusic implements Music{

    public void doMyInit() {
        System.out.println("Doing RockMusic class initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing RockMusic class destruction");
    }

    @Override
    public String getSong() {
        return "Rock music";
    }
}
