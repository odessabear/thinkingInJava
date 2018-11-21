package polymorphism;

class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }

    Glyph() {
        System.out.println("Glyph() before calling draw()");
        draw();
        System.out.println("Glyph() after calling draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;

    RoundGlyph(int radius) {
        this.radius = radius;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }

    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}

class RectangularGlyph extends Glyph {
    private int side = 4;

    RectangularGlyph(int side) {
        this.side = side;
        System.out.println("RectangularGlyph.RectangularGlyph(), side = " + side);
    }

    void draw(){
        System.out.println("RectangularGlyph.draw(), side = " + side);

    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RectangularGlyph(6);
    }
}
