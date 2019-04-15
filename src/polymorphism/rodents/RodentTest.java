package polymorphism.rodents;

import java.util.*;

public class RodentTest {


    public static void main(String[] args) {
        Shared shared = new Shared();
        Rodent[] rodents = {
                new Mouse(shared),
                new Hamster(shared),
                new Rat(shared),
                new Mouse(shared),
                new Hamster(shared)
        };

//        for (Rodent rodent : rodents) {
//            rodent.toString();
//        }


        List<Rodent> rodentList = Arrays.asList(rodents);
        Iterator<Rodent> it = rodentList.iterator();

        while (it.hasNext()){
            Rodent rodent = it.next();
            System.out.println(rodent.toString());
        }
    }
}
