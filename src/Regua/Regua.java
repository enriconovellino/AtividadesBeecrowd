package Regua;

public class Regua {
    public void regua(int esquerda, int direita, int altura) {
        if(altura <= 0) {
            return;
        }
        /*
        if(altura != 0) {
            ...comandos...
        }
         */
        int media = (esquerda + direita) / 2;
        marca(media,  altura);
    }

    public void marca(int media, int altura) {
        return;
    }
}
