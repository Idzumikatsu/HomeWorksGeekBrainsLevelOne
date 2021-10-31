package HomeWork6;

public class Cat extends Animal {
    private static int value;

    public Cat(String name) {
        super(name);
        value++;
    }

    public void run(int runValue) {
        if (runValue <= 0 ) {
            System.out.println("Для того, чтобы кот бежал - введите значение от 1 до 200");
        } else if (runValue > 200) {
            System.out.println("Кот не может пробежать более 200 метров без отдыха");
        } else {
            System.out.println("Кот " + getName() + " пробежал " + runValue + " м.");
        }
    }

    public void swim(int swimValue) {
        System.out.println("Наш котик " + getName() + " плавает как топор, давайте не будем рисковать.");
    }

    @Override
    public int getValue() {
        return value;
    }
}
