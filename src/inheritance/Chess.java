package inheritance;

class Game {
    Game(int i){
        System.out.println("inheritance.Game Constructor");
    }
}

class BoardGame extends Game{

  BoardGame(int i){
      super(i);
      System.out.println("inheritance.BoardGame Constructor");
  }

}

public class Chess extends BoardGame {
    Chess(){
        super(11);
        System.out.println("inheritance.Chess Constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
