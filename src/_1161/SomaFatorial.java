package _1161;

public class SomaFatorial {
    public long somaFatorial(long num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * somaFatorial(num - 1);
    }
}
