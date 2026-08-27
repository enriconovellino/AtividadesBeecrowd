package Euclides;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Euclides euclides = new Euclides();
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println(euclides.f(a,b));
    }
}
