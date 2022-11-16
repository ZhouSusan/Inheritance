package animals;

public class Turtle extends Animal {

    private int speed;

    public Turtle(String name, String type, String color, int height, int weight, int speed) {
        super(name, type, color, height, weight);
        this.speed = speed;
    }

    @Override
    public String aboutMe() {
        super.aboutMe();
        return "My shell is green, and I can speed up to " + speed + " mph.";
    }
}
