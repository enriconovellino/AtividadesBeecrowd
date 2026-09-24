package _3135;

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

            while(aux != null && aux.elemento.length() <= elemento.length()) {
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

    public String toString() {
        No aux = primeiro;
        String s = primeiro.elemento;
        int lastLength = 0;

        while(aux != null) {
            if(aux.elemento.length() > lastLength) {
                s += ", " + aux.elemento;
                lastLength = aux.elemento.length();
            }
            aux = aux.proximo;

        }
        return s.trim();
    }

    public void remove(String elemento) {
        No aux = primeiro;
        No penultimo = null;

    }
}

