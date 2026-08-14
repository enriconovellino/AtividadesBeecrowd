package TorreDeHanoia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Torre torre = new Torre();

        int n =  input.nextInt();
        String a =  input.next();
        String b =   input.next();
        String c =    input.next();

        torre.deHanoia(n,a,b,c);
    }
}
