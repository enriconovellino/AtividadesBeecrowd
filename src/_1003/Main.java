package _1003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Soma soma = new Soma();

        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("SOMA = " + soma.soma(a, b));
    }
}
