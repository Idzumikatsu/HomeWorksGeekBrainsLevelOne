package LevelTwoJava.HomeWork1;

public class App {
    public static void main(String[] args) {

        Players[] players = {
                new Human(),
                new Robot(),
                new Cat()
        };

        Barriers[] barriers = {
                new Wall(2),
                new Track(7),
                new Wall(5),
                new Track(15)
        };

        for (Barriers barrier : barriers) {
            for (Players player : players) {
                barrier.cross(player);
            }
        }

        System.out.println("Победители");
        for (Players player : players) {
            if (player.isPlay()) {
                System.out.println(player);
            }
        }
    }
}
