package exceptions;

class ConstructException extends Exception{}

class FClass {
    public FClass() throws ConstructException{
        throw new ConstructException();
    }
}

class SClass extends FClass{
    public SClass() throws ConstructException{
        super();
//        try {
//            super();
//        }catch (ConstructException e){
//        }
    }
}

public class Ex21 {
    public static void main(String[] args) {
        try {
            SClass sClass = new SClass();
        }catch (ConstructException e){
            System.out.println("ConstructException caught in main!");
        }
    }
}
