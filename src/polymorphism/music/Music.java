package polymorphism.music;

class Instrument {

    void play(Note note) {
        System.out.println("Instrument.play()" + note);
    }

    void adjust() {
        System.out.println("Adjusting Instrument");
    }

    public String toString() {
        return "Instrument";
    }
}

class Wind extends Instrument {
    void play(Note note) {
        System.out.println("Wind.play()");
    }

    public String toString() {
        return "Wind";
    }

    void adjust() {
        System.out.println("Adjusting Wind");
    }
}

class Percussion extends Instrument {
    void play(Note note) {
        System.out.println("Percussion.play()");
    }

    public String toString() {
        return "Percussion";
    }

    void adjust() {
        System.out.println("Adjusting Percussion");
    }
}

class Stringed extends Instrument {
    void play(Note note) {
        System.out.println("Stringed.play()");
    }

    public String toString() {
        return "Stringed";
    }

    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}

class Woodwind extends Wind {
    void play(Note note) {
        System.out.println("Woodwind.play()");
    }

    void adjust() {
        System.out.println("Adjusting Woodwind");
    }

    public String toString() {
        return "Woodwind";
    }
}

class Cello extends Stringed {
    void play(Note note) {
        System.out.println("Cello.play()");
    }

    void adjust() {
        System.out.println("Adjusting Cello");
    }

    public String toString() {
        return "Cello";
    }
}

class Brass extends Wind {
    void play(Note note) {
        System.out.println("Brass.play()");
    }

    void adjust() {
        System.out.println("Adjusting Brass");
    }

    public String toString() {
        return "Brass";
    }
}

public class Music {

    // private static RandomInstrumentGenerator generator = new RandomInstrumentGenerator();

    public static void tune(Instrument instrument) {
        instrument.play(Note.MIDDLE_C);
    }


    public static void tuneAll(Instrument[] instruments) {
        for (Instrument instrument : instruments) {
            tune(instrument);
        }
    }

    public static void main(String[] args) {
        RandomInstrumentGenerator generator = new RandomInstrumentGenerator();
        Instrument[] instruments = new Instrument[15];

        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind(),
                new Cello()
        };
        tuneAll(orchestra);
        for (int i = 0; i < orchestra.length; i++) {
            System.out.println(orchestra[i]);
        }
        for (int i = 0; i < instruments.length; i++) {
            instruments[i] = generator.next();
        }

        for (Instrument instrument : instruments) {
            instrument.adjust();
        }

    }
}
