package inheritance;

class Values{
    private String word;
    public Values(String word){
        this.word = word;
        System.out.println(word);
    }
}

public class FinalTest2 {
    private final Values value1;
    public FinalTest2(){
        value1 = new Values("first");
    }

    public FinalTest2(String word){
        value1 = new Values("second");
    }

        FinalTest2 test1 = new FinalTest2();
        FinalTest2 test2 = new FinalTest2("word");

}
