package _2381;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lista chamada = new Lista();

        int n =  sc.nextInt();
        int numAluno = sc.nextInt();


        String agua = sc.nextLine();

        for(int i = 0; i < n; i++){
            String aluno = sc.nextLine();
            chamada.add(aluno);
        }
        System.out.println(chamada.get(numAluno));
    }
}
