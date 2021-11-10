package HomeWork7;

import java.util.Arrays;

public class RunApp {

    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Барсик", 3, true);
        cats[1] = new Cat("Мурзик", 2, true);
        cats[2] = new Cat("Марсик", 8, true);
        cats[3] = new Cat("Василий", 9, true);
        cats[4] = new Cat("Шурик", 2, true);
        Plate plate = new Plate(0);
        plate.info();
        plate.addFood(19);

        Arrays.stream(cats).forEach(cat -> {
            cat.isHungry(plate);
            cat.eat(plate);
            plate.info();
        });
    }
}
