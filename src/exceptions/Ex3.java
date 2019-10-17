package exceptions;

public class Ex3 {
    public static void main(String[] args) {
        int[] array = new int[3];
        for (int i = 0;i<array.length;i++){
            array[i] = i;
        }
        try{
            System.out.println(array[4]);
        }catch (IndexOutOfBoundsException e){
            System.err.println("Caught IndexOutOfBoundsException " );
            e.printStackTrace();
        }
    }
}
