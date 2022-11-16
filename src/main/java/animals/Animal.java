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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public String aboutMe() {
       String res = new String("My name is " + name + ", and I am a " + type + ".");
       return res;
    }
}
