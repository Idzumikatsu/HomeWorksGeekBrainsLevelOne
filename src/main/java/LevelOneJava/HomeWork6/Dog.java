package LevelOneJava.HomeWork6;

public class Dog extends Animal {

    private static int value;

    public Dog(String name) {
        super(name);
        value++;
    }

    public void run(int runValue) {
        if (runValue <= 0 ) {
            System.out.println("Для того, чтобы пес бежал - введите значение от 1 до 500");
        } else if (runValue > 500) {
            System.out.println("Пес не может пробежать более 500 метров без отдыха");
        } else {
            System.out.println("Пёс " + getName() + " пробежал " + runValue + " м.");
        }
    }

    public void swim(int swimValue) {
        if (swimValue <= 0 ) {
            System.out.println("Для того, чтобы пес плыл - введите значение от 1 до 500");
        } else if (swimValue > 10) {
            System.out.println("Пес не может проплыть более 10 метров без отдыха");
        } else {
            System.out.println("Пёс " + getName() + " проплыл " + swimValue + " м.");
        }
    }

    @Override
    public int getValue() {
        return value;
    }
}
