package _1028;

public class Figurinhas {
    public int contFigurinhas(int a, int b) {
        if(b == 0) {
            return a;
        }
        return contFigurinhas(b, a%b);
    }
}
