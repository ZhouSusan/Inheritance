package animals;

public class Animal {
    private String name;
    private String type;
    private String color;
    private int weight, height;

    public Animal(String name, String type, String color, int height, int weight) {
        this.name = name;
        this.type = type;
        this.color = color;
        this.height = height;
        this.weight = weight;
    }

    public void speak() {
        System.out.println("Hello.");
    }

    public void eat() {
        System.out.println("I eat food");
    }

    public void play() {
        System.out.println("I like to .... you tell me.");
    }
}
