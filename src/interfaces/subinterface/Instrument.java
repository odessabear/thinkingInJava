package interfaces.subinterface;

import enums.Note;

public interface Instrument {
    int VALUE = 5;
    void play(Note note);
    void adjust();
}
