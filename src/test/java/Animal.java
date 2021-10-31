public abstract class Animal {
    String name;

    private static int value;

    public Animal(String name) {
        this.name = name;
        value++;
    }


    public String getName() {
        return name;
    }

    public void run(){
    }

    public void swim(){
    }

    public int getValue() {
        return value;
    }
}
