package Fatorial;

public class Fatorial {
    public long fatorialComRecursividade(long n) {
        if (n <= 1) {
            return n;
        }
        return n * fatorialComRecursividade(n - 1);
    }

    public int fatorialComFor(int n) {
        int produto = 1;
        for(int i = 1; i <= n; i++) { // for(int i = 0; i < n; i++)
            produto = produto * i; // (n - 1);
        }
        return produto;
    }
}
