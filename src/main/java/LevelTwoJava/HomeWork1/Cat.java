package LevelTwoJava.HomeWork1;

public class Cat implements Players {
    final int jumpLim = 200;
    final int runLim = 80;

    @Override
    public void jump() {
        System.out.println("Кот прыгнул");
    }

    @Override
    public void run() {
        System.out.println("Кот побежал");
    }

    @Override
    public void cross(Wall wall) {
    }

    @Override
    public void cross(Track track) {

    }
}
