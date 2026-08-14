package Soma;

public class Soma {
    public int somaEmSequencia(int n) {
        int soma = 0;
        if(n == 0) {
            return n;
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
