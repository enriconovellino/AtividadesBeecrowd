package Fibonacci;

public class Fibonacci {
    public int fibonacciComRecursao(int n) {
        if(n <= 1) {
            return n;
        }
        // 5
        return fibonacciComRecursao(n-1) + fibonacciComRecursao(n-2);
        // return fibonacci(4) + fibonacci(3)
        // return fibonacci(3) + fibonacci(2)
        // return fibonacci(2) + fibonacci(1)
        // return fibonacci(1) + fibonacci(0)
    }

    public int fibonacciSemRecursao(int n) {
        int primeiro_termo = 0;
        int segundo_termo = 1;

        if (n == 0) {
            return primeiro_termo;
        }

        if (n == 1) {
            return segundo_termo;
        }

        int auxiliar;

        /*
        if(n < n) {
            return n;
        }
         */

        for(int i = 2; i <= n; i++) {
            auxiliar = primeiro_termo + segundo_termo;
            primeiro_termo = segundo_termo;
            segundo_termo = auxiliar;
        }

        return segundo_termo;
    }
}
