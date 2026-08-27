package Euclides;

public class Euclides {
    public int f(int a, int b) {
        if(b == 0) {
            return a;
        }
        return f(b, a%b );
    }
}
