package animals;

public class Turtle extends Animal {

    private int speed;

    public Turtle(String name, String type, String color, int height, int weight, int speed) {
        super(name, type, color, height, weight);
        this.speed = speed;
    }

    public void sleep() {
        if (speed <= speed/3) {
            speed += 10;
            System.out.println("Time to sleep");
        } else {
            System.out.println("Not time to sleep yet. I am still full of gas.");
        }
    }

    @Override
    public String aboutMe() {
        return "I am " + this.getName() + ". My shell is " + this.getColor() + ", and I can run up to " + speed + " mph.";
    }
}
