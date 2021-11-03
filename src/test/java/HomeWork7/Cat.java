package HomeWork7;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean hungry;

    public Cat(String name, int appetite, boolean hungry) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = hungry;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(appetite);
    }

    public boolean isHungry(Plate plate) {
        if (appetite <= plate.getFood()) {
            System.out.println("Котик " + name + " поел и наелся");
            return !hungry;
        } else {
            System.out.println("Котик " + name + " не наелся");
            return hungry;
        }
    }
}
