package Soma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Soma soma = new Soma();
        int n = input.nextInt();
        int k = input.nextInt();
        System.out.println(soma.somaEmSequencia(n));
        System.out.println(soma.somaEmSequenciaFor(k));
    }
}
