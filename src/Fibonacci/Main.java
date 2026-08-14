package Fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Fibonacci fibonacci = new Fibonacci();

        int n = input.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.print(fibonacci.fibonacciComRecursao(i) + " ");
        }
        System.out.println("--------------------------------------------------------");
        for(int j = 0; j < n; j++) {
            System.out.print(fibonacci.fibonacciSemRecursao(j) + " ");
        }
    }
}
// 6 -> 0 1 1 2 3 5
