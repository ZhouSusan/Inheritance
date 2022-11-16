package animals;

public class Bird extends Animal {

    private boolean canFly;

    public boolean getCanFly() {
        return canFly;
    }

    public Bird(String name,  String type, String color, int height, int weight) {
        super(name, type, color, height, weight);
        this.canFly = true;
    }

    @Override
    public void speak() {
        System.out.println("Chirk! Chirck!");
    }

    @Override
    public void play() {
        System.out.println("I like to sing and fly.");
    }

    public void fact() {
        System.out.println("Ravens are great at mimicking human speech and sounds.");
    }
}
