package src.generics.characters;

public class StoryCharacters {
    private static long count = 0;
    private final long id = count++;

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
