package LevelTwoJava.HomeWork1;

public class Human implements Players {
    final int jumpLim = 150;
    final int runLim = 50;

    public int getJumpLim() {
        return jumpLim;
    }

    public int getRunLim() {
        return runLim;
    }

    @Override
    public void jump() {
        System.out.println("Человек прыгнул");
    }

    @Override
    public void run() {
        System.out.println("Человек побежал");
    }

    @Override
    public void cross(Wall wall) {
    }

    @Override
    public void cross(Track track) {

    }

}
