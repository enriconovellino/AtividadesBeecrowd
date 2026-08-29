package _1161;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SomaFatorial somaFatorial = new SomaFatorial();

        while (input.hasNextInt()) {
            long num1 = input.nextInt();
            long num2 = input.nextInt();
            System.out.println(somaFatorial.somaFatorial(num1) + somaFatorial.somaFatorial(num2));
        }
        input.close();
    }
}
