package _2729;

public class Lista {
    public No primeiro;
    public No ultimo;
    public int contador;

    public Lista() {
        this.primeiro = null;
        this.ultimo = null;
        this.contador = 0;
    }

    public void adicionar(String elemento) {
        No novo = new No(elemento);

        if(contador == 0) {
            primeiro = novo;
            ultimo = novo;
            contador++;

        }
        else if (!contains(elemento)) {
            adicionarEmOrdem(elemento);
        }
    }

    public void adicionarEmOrdem(String elemento) {
        No novo = new No(elemento);

        if(contador == 0) {
            adicionar(elemento);
        }
        else {
            No aux = primeiro;
            No penultimo = null;

            while(aux != null && aux.elemento.compareTo(elemento) < 0) {
                penultimo = aux;
                aux = aux.proximo;
            }
            if(aux == primeiro) {
                primeiro = novo;
                novo.proximo = aux;
                contador++;
            }
            else if (aux == null) {
                penultimo.proximo = novo;
                ultimo = novo;
                contador++;
            }
            else {
                penultimo.proximo = novo;
                novo.proximo = aux;
                contador++;
            }
        }
    }

    public boolean contains(String elemento) {
        No aux = primeiro;

        while(aux != null) {
            if(aux.elemento.equals(elemento)) {
                return true;
            }
            aux = aux.proximo;
        }
        return false;
    }

    public int size() {
        return contador;
    }

    public String toString() {
        No aux = primeiro;
        String s = "";

        while(aux != null) {
            s += aux.elemento + " ";
            aux = aux.proximo;
        }
        return s.trim();
    }
}
