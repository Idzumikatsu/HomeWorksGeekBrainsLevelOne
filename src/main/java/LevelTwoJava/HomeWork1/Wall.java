package LevelTwoJava.HomeWork1;

public class Wall implements Barriers {
    final int HEIGHT = 200;

    public int getHEIGHT() {
        return HEIGHT;
    }

    @Override
    public void cross(Wall wall) {

    }

    @Override
    public void cross(Track track) {

    }
}
