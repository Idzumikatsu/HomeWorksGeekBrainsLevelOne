package LevelTwoJava.HomeWork1;

public class Track implements Barriers {
    private final int length;

    public Track(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void cross(Players players) {
        players.run(this);
    }

    @Override
    public String toString() {
        return "Беговая дорожка длиной : " + length + " метров";
    }
}
