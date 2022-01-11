package LevelTwoJava.HomeWork1;

public class App {
    public static void main(String[] args) {
        Players[] players = {
                new Human(),
                new Robot(),
                new Cat()
        };

        Barriers[] barriers = {
                new Wall(),
                new Track()
        };

    }
}
