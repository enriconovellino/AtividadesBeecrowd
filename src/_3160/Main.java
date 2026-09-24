package _3160;

import java.lang.invoke.StringConcatFactory;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Lista listaAmigos = new Lista();

        String[] amigoAtual = sc.nextLine().split(" ");
        String[] amigoNovo = sc.nextLine().split(" ");

        String agua = sc.nextLine();

        for(String s : amigoAtual) {
            listaAmigos.adicionar(s);
        }

        for(String s : amigoNovo) {
            listaAmigos.adicionarAntes(s, agua);
        }

        System.out.println(listaAmigos);
    }
}
