package animals;

public class Shark extends Animal {

    private int energyLevel = 100;

    public Shark(String name, String type, String color, int height, int weight, int energyLevel) {
        super(name, type, color, height, weight);
        this.energyLevel = energyLevel;
    }

    @Override
    public void eat() {
        if (energyLevel < 100) {
            energyLevel += 10;
            int diff = 100 - energyLevel;
            System.out.format("Crunch, Crunch! Only %s energy left.", energyLevel);
        }  else {
            System.out.format("I am %s% full", energyLevel);
        }
    }
}
