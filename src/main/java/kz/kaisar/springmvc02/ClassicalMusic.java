package kz.kaisar.springmvc02;

public class ClassicalMusic implements Music {

    private  ClassicalMusic() {};

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Doing ClassicalMusic class initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing ClassicalMusic class destruction");
    }

    @Override
    public String getSong() {
        return "Classical music";
    }
}
