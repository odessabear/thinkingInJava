package polymorphism;

class Super{
     void firstMethod(){
         System.out.println("Super first method");
         this.secondMethod();
    }

     void secondMethod(){
        System.out.println("Super second method");
    }
}

class SubClass extends Super{
    void secondMethod(){
        System.out.println("Subclass second method");
    }
}

public class Excercise10 {

    public static void main(String[] args) {
        Super object = new SubClass();
        object.firstMethod();
    }
}
