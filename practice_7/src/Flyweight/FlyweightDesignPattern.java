package Flyweight;

public class FlyweightDesignPattern {
    private static final String colors[] = { "Red", "Orange", "Blue", "Yellow", "Pink" };
    public static void main(String[] args) {

        for(int i=0; i < 5; ++i) {
            AngryBird angrybird = (AngryBird)BirdFactory.getAngryBird(getRandomColor());
            angrybird.draw();
        }
    }
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }

}

//https://examples.javacodegeeks.com/core-java/java-flyweight-design-pattern-example///