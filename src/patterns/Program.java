package patterns;

import patterns.service.ServiceSum;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();

        ServiceSum serviceSum = new ServiceSum();
        int sum = serviceSum.calculate(a,b);
        System.out.println("Result: ");
        System.out.println(sum);
    }
}
