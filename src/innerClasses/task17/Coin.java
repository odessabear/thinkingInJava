package innerClasses.task17;

import java.util.Random;

public class Coin implements Game {
    private Random random = new Random();
    @Override
    public void throwing() {
        System.out.println("dropped side of the coin is ");
        switch (random.nextInt(2)) {
            case 0:
                System.out.println("Heads");
                return;
            case 1:
                System.out.println("Tails");
                return;
            default:
                System.out.println("OnEdge");
        }
    }

    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Coin();
        }
    };
}
