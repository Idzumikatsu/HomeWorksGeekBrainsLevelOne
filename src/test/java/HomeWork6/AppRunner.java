package HomeWork6;

public class AppRunner {
    public static void main(String[] args) {
        Animal animal = new Animal(""){};
        Animal animal2 = new Cat("Мурзик");
        Animal animal4 = new Cat("Мурзик");
        Animal animal5 = new Cat("Мурзик");
        Animal animal3 = new Dog("Бобик");
        Animal animal6 = new Dog("Бобик");
        if (animal2 instanceof Cat) {
            ((Cat)animal2).run(-30);
            ((Cat)animal2).run(120);
            ((Cat)animal2).run(250);
            ((Cat)animal2).swim(160);
        }
        System.out.println();

        if (animal3 instanceof Dog) {
            ((Dog)animal3).run(-10);
            ((Dog)animal3).run(350);
            ((Dog)animal3).run(501);
            ((Dog)animal3).swim(-15);
            ((Dog)animal3).swim(8);
            ((Dog)animal3).swim(14);
        }
        System.out.println();

        System.out.println("Животных создано: " + animal.getValue());
        System.out.println("Котов создано: " + animal2.getValue());
        System.out.println("Собак создано: " + animal3.getValue());
    }

}
