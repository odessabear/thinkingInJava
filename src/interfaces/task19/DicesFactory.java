package interfaces.task19;

public class DicesFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new Dice();
    }
}
