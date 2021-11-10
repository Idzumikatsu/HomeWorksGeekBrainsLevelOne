package HomeWork7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int appetite) {
        if (food >= appetite) {
            food -= appetite;
        }
    }

    public void info() {
        System.out.println("В настоящий момент в миске: " + food + " еды.");
    }

    public void addFood(int value) {
        if (value > 0) {
            this.food += value;
            System.out.println("В миску досыпали " + value + " еды, теперь в ней " + food + " еды.");
        } else if (value == 0) {
            System.out.println("Котики разочарованно смотрят на вас в ожидании новой еды.");
        } else {
            System.out.println("Не стыдно? Воровать у котиков еду - последнее дело!");
        }
    }

    public int getFood() {
        return food;
    }
}
