package _1044;

public class Logica {
    public String multiplos(int a, int b) {
        if (a % b == 0 || b % a == 0) {
            return "Sao Multiplos";
        } else {
            return "Nao sao Multiplos";
        }
    }
}
