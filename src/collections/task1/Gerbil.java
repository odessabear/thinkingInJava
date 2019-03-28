package collections.task1;


import java.util.ArrayList;

public class Gerbil {
    private int gerbilNumber;

    public Gerbil(int i) {
        gerbilNumber = i;
    }

    public void hop() {
        System.out.println("gerbilNumber is " + gerbilNumber);
    }

    public static void main(String[] args) {
        ArrayList<Gerbil> gerbilArrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            gerbilArrayList.add(new Gerbil(i));
        }
        for (Gerbil g: gerbilArrayList) {
            g.hop();
        }
    }

}
