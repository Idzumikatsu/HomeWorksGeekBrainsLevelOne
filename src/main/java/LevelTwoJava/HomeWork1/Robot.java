package LevelTwoJava.HomeWork1;

public class Robot implements Players {
    final int jumpLim = 300;
    final int runLim = 25;

    @Override
    public void jump() {
        System.out.println("Робот прыгнул");
    }

    @Override
    public void run() {
        System.out.println("Робот побежал");
    }

    @Override
    public void cross(Wall wall) {
    }

    @Override
    public void cross(Track track) {

    }
}
