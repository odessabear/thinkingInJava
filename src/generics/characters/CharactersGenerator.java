package src.generics.characters;

import src.generics.Generator;

import java.util.Iterator;
import java.util.Random;

public class CharactersGenerator implements Generator<StoryCharacters>, Iterable<StoryCharacters> {
    private Class[] characters = {DrZlo.class, IronMan.class, Locky.class, Magnito.class, MrAmerica.class, Tor.class};
    private static Random random = new Random(47);

    public CharactersGenerator() {
    }

    private int size = 0;

    public CharactersGenerator(int size) {
        this.size = size;
    }

    @Override
    public StoryCharacters next() {
        try {
            return (StoryCharacters) characters[random.nextInt(characters.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Iterator<StoryCharacters> iterator() {
        return new StoryCharactersIterator();
    }

    class StoryCharactersIterator implements Iterator<StoryCharacters> {
        int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public StoryCharacters next() {
            count--;
            return CharactersGenerator.this.next();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) {
        CharactersGenerator generator = new CharactersGenerator();
        for (int i = 0; i < 6; i++){
            System.out.println(generator.next());
        }
        for (StoryCharacters s : new CharactersGenerator(6)){
            System.out.println(s);
        }
    }
}