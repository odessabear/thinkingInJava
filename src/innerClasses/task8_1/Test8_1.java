package innerClasses.task8_1;

public class Test8_1 {
    private void returnCount(int a, int b) {
        int result = a + b;
        if (result > 5) {
            class Message implements Counting {
                @Override
                public void returnResult() {
                    System.out.println("it's more than five");
                }
            }
            Message message = new Message();
            message.returnResult();
        }else {
            System.out.println("it's less then five");
        }

    }

    public static void main(String[] args) {
        Test8_1 test = new Test8_1();
        test.returnCount(2,0);
    }
}
