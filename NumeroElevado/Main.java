package NumeroElevado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Elevacao dois = new Elevacao();

        //int k = input.nextInt();

        //System.out.println(dois.elevadoA(k));

         Elevacao elevacaoDeNumeros = new Elevacao();

         int numero = input.nextInt();
         int n = input.nextInt();

        System.out.println(elevacaoDeNumeros.elevadoB(numero, n));
    }
}
