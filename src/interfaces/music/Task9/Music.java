package interfaces.music.Task9;

import enums.Note;

class Wind extends MusicAbstraction{
    @Override
    public void play(Note note) {
        System.out.println(this + ".play()" + note);
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }

    public String toString(){
        return "Wind";
    }
}

class Percussion extends MusicAbstraction{

    @Override
    public void play(Note note) {
        System.out.println(this + ".play()" + note);
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }

    public String toString(){
        return "Percussion";
    }
}

class Stringed extends MusicAbstraction{

    @Override
    public void play(Note note) {
        System.out.println(this + ".play()" + note);
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }

    public String toString(){
        return "Stringed";
    }
}

class Brass extends Wind{
    public String toString(){return "Brass";}
}

class Woodwind extends Wind{
    public String toString(){
        return "Woodwind";
    }
}

public class Music {

    static void tune(MusicAbstraction instrument){
        instrument.play(Note.B_FLAT);
    }

    static void tuneAll(MusicAbstraction[] instruments){
        for (MusicAbstraction instrument:instruments){
            tune(instrument);
        }
    }

    public static void main(String[] args) {
        MusicAbstraction[] orchestra = {new Wind(),new Percussion(),new Stringed(),
        new Brass(),new Woodwind()};

        tuneAll(orchestra);
    }
}
