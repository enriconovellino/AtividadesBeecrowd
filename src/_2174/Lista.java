package _2174;

import java.lang.invoke.StringConcatFactory;

public class Lista {
    private No primeiro;
    private No ultimo;
    private int contador;

    public Lista() {
        this.primeiro = null;
        this.ultimo = null;
        this.contador = 0;
    }

    public void adicionar(String elemento) {
        No novo = new No(elemento);
        if(primeiro == null) {
            primeiro = novo;
            ultimo = novo;
        } else {
            ultimo.proximo = novo;
            ultimo = novo;
        }
        contador++;
    }

    public boolean contem(String elemento) {
        No auxiliar = primeiro;
        for(int i = 0; i < contador; i++) {
            if(auxiliar.elemento.equals(elemento)) {
                return true;
            }
            auxiliar = auxiliar.proximo;
        }
        return false;
    }

    public int tamanho() {
        return contador;
    }
}
