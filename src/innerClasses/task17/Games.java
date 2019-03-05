package innerClasses.task17;

public class Games {
    private static void playGame(GameFactory factory){
        Game game = factory.getGame();
        game.throwing();
    }

    public static void main(String[] args) {
        playGame(Coin.factory);
        System.out.println();
        playGame(Dice.factory);
    }
}
