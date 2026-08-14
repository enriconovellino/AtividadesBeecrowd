package _1002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Area area = new Area();

        double raio = input.nextDouble();

        System.out.printf("A=%.4f\n", area.doCirculo(raio));
    }
}
