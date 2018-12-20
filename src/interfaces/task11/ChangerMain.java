package interfaces.task11;

public class ChangerMain {


    private static String s = "yoyoyoyo";

    public static void main(String[] args) {
        Apply.process(new ProcessorImpl(new ChangePosition()),s);
    }

}
