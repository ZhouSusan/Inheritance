package animals;

public class Test {
    public static void main(String[] args) {
        Turtle slowPoke = new Turtle("Torri", "Turtle", "Yellowish-Blue", 4, 3, 22);
        slowPoke.eat();
        System.out.println(slowPoke.aboutMe());
        slowPoke.sleep();

        Bird tweety = new Bird("Tweetester", "Bird", "purple", 4, 2, true);
        System.out.println(tweety.aboutMe());
        tweety.play();
        tweety.speak();
        tweety.fact();

        Shark sharpie = new Shark("Sharpie", "Shark", "grey", 16, 34, 60);
        System.out.println(sharpie.aboutMe());
        sharpie.eat();
        sharpie.eat();
        sharpie.eat();
        sharpie.eat();
    }
}