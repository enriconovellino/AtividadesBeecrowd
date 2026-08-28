package NumeroElevado;

import java.util.Scanner;

public class Elevacao {
    Scanner input = new Scanner(System.in);
    public int elevadoA(int k) {
        if(k <= 1) {
            return 1;
        }

        if(k < 0) {
            return 1/elevadoA(-k);
        }

        return 2 * elevadoA(k - 1);
        // return numero * elevadoA(k - 1);
        // Ainda tenha a ideia de elevar um número que você quer.
    }

    public int elevadoB(int numero, int n) {
        if(n == 0) {
            return 1;
        }
        if(n == 1) {
            return numero;
        }
        return numero * elevadoB(numero, n - 1);
    }
}
