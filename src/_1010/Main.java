package _1010;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculo calculo = new Calculo();

        int codigoA = input.nextInt();
        int numPecasA = input.nextInt();
        double precosA = input.nextDouble();

        int codigoB = input.nextInt();
        int numPecasB = input.nextInt();
        double precosB = input.nextDouble();

        System.out.printf("VALOR A PAGAR: R$ %.2f", calculo.calculoSimples(numPecasA, precosA) +  calculo.calculoSimples(numPecasB, precosB));
    }
}
