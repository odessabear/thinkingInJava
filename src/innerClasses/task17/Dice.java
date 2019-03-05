package innerClasses.task17;

import java.util.Random;

public class Dice implements Game {
    private Random random = new Random();
    private int side1 = random.nextInt(6) + 1;
    private int side2 = random.nextInt(6) + 1;

    @Override
    public void throwing() {
        System.out.println("dropped sides of the dices are " + side1 + " and " + side2);

    }

    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Dice();
        }
    };
}
