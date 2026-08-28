package Soma;

public class Soma {
    public int somaEmSequencia(int n) {
        /*
        if(n == 0) {
            return n;
        } Não faz sentido
         */
        if(n == 1) {
            return 1;
        }
        return n + somaEmSequencia(n - 1);
    }

    public int somaEmSequenciaFor(int k) {
        int soma = 0;
        if(k == 0) {
            return k;
        }
        for(int i = 1; i <= k; i++) {
            soma = soma + i;
        }
        return soma;
    }
}
