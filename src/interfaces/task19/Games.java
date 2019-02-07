package interfaces.task19;

public class Games {
    private static void playGame(GameFactory factory){
        Game game = factory.getGame();
        game.throwing();
    }

    public static void main(String[] args) {
        playGame(new CoinFactory());
        System.out.println();
        playGame(new DicesFactory());
    }
}
