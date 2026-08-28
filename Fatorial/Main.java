package Fatorial;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        Fatorial fatorial = new Fatorial();

        int n = input.nextInt();

        System.out.println("fatorial com for:");
        System.out.println(fatorial.fatorialComFor(n));
        System.out.println("fatorial com recursividade:");
        System.out.println(fatorial.fatorialComRecursividade(n));
    }
}
