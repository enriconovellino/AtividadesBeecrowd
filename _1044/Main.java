package _1044;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Logica logica = new Logica();

        int a =  input.nextInt();
        int b = input.nextInt();

        System.out.println(logica.multiplos(a, b));
    }
}
