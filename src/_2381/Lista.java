package _2381;

public class Lista {
    public No primeiro;
    public No ultimo;
    public int contador;

    public Lista() {
        this.primeiro = null;
        this.ultimo = null;
        this.contador = 0;
    }

    public void add(String elemento) {
        No novo = new No(elemento);

        if(contador == 0) {
            primeiro = novo;
            ultimo = novo;
        }
        else {
            No atual = primeiro;
            No penultimo = null;

            while(atual != null && novo.elemento.compareTo(atual.elemento) >= 0) {
                penultimo = atual;
                atual = atual.proximo;
            }
            if(atual == primeiro) { // inserção no início
                novo.proximo = primeiro;
                primeiro = novo;
            }
            else if(atual == null) { // inserção no final
                ultimo.proximo = novo;
                ultimo = novo;
            }
            else { // inserção no meio
                penultimo.proximo = novo;
                novo.proximo = atual;
            }
        }
        contador++;
    }

    public String get(int posicao) {
        No aux = primeiro;
        for(int i = 1; i < posicao; i++) {
            aux = aux.proximo;
        }
        return aux.elemento;
    }
}