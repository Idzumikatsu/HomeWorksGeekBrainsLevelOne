package LevelTwoJava.HomeWork1;

public class Wall implements Barriers {
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void cross(Players players) {
        players.jump(this);
    }

    @Override
    public String toString() {
        return "Стена высотой : " + height + " метров";
    }
}
