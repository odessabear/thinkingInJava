package innerClasses.task10;

public class Test_Task10 {
private Name getName(String newString){
    return new Name() {
    private String name = newString;
        @Override
        public String returnString() {
            return name;
        }
    };
}

    public static void main(String[] args) {
        Test_Task10 test = new Test_Task10();
        Name ourName = test.getName("Anonimos");
        System.out.println(ourName.returnString());
    }
}
