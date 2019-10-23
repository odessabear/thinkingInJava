package strings;

import java.util.Formatter;

public class Receipt {
    private double total = 0;
    private Formatter f = new Formatter(System.out);
    private static final int item = 15;
    private static final int qty = 5;
    private static final int price = 10;
    private String s1 = "%-" + item + "s %" + qty + "s %" + price + "s\n";
    private String s2 = "%-" + item + ".15s %" + qty + "d %" + price + ".2f\n";
    private String s3 = "%-" + item + "s %" + qty + "s %" + price + ".2f\n";

    public void printTitle(){
        f.format(s1,"Item","Qty","Price");
        f.format(s1,"-----","-----","-----");
    }

    public void print(String name, int qty, double price){
        f.format(s2,name,qty,price);
        total +=price;

    }

    public void printTotal(){
        f.format(s3,"Tax","",total*0.06);
        f.format(s1,"","","-----");
        f.format(s3,"Total","",total*1.06);
    }

    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack's Magic Beans",4,4.25);
        receipt.print("Princess Peas",3,3.51);
        receipt.print("Three Bears Porridge",1,14.29);
        receipt.printTotal();
    }


}
