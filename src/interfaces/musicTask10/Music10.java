package interfaces.musicTask10;

import enums.Note;
import interfaces.subinterface.Instrument;
import interfaces.subinterface.Playable;

class Wind implements Playable, Instrument {

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

class Percussion implements Playable,Instrument{

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }

    @Override
    public void play(Note note) {
        System.out.println(this + ".play() " + note);
    }

    public String toString(){
        return "Percussion";
    }
}

class Stringed implements Playable,Instrument{

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }

    @Override
    public void play(Note note) {
        System.out.println(this + ".play() " + note);
    }

    public String toString(){
        return "Stringed";
    }
}

class Woodwind extends Wind{
    public String toString(){
        return "Woodwind";
    }
}

class Brass extends Wind{
    public String toString(){
        return "Brass";
    }
}

public class Music10 {
    private static void tune(Playable playable){
        playable.play(Note.B_FLAT);
    }

    private static void tuneAll(Playable[] playables){
        for (Playable p : playables){
            tune(p);
        }
    }

    public static void main(String[] args) {
        Playable[] playables = {new Wind(),new Percussion(),new Stringed(),
        new Woodwind(),new Brass()};

        tuneAll(playables);
    }
}
