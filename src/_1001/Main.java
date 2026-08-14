package _1001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Metodos metodoSoma = new Metodos();

        int dadoA = input.nextInt();
        int dadoB = input.nextInt();

        System.out.println("X = " + metodoSoma.soma(dadoA, dadoB));
    }
}
