package innerClasses.task12;

public class Task12Main {
    private Vampire badVampire(){
        return new Vampire() {
            @Override
            public void drinkBlood() {
                System.out.println("Bad vampire drinking your blood");
            }

            @Override
            public void destroy() {
                System.out.println("Bad vampire destroying your mind");
            }

            @Override
            public void kill() {
                System.out.println("Bad vampire killing you");
            }

            @Override
            public void menace() {
                System.out.println("Bad vampire terrifies you");
            }
        };
    }


    public static void main(String[] args) {
        Task12Main task = new Task12Main();
        Vampire vampire = task.badVampire();
        vampire.menace();
        vampire.destroy();
        vampire.drinkBlood();
        vampire.kill();
    }
}
