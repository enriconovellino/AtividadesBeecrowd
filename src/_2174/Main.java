package _2174;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lista pokedex = new Lista();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++) {
            String a = sc.nextLine();
            boolean existe = pokedex.contem(a);
            if(existe == false) {
                pokedex.adicionar(a);
            }
        }
        System.out.println("Falta(m) " + (151 - pokedex.tamanho()) + " pomekon(s).");
    }
}
