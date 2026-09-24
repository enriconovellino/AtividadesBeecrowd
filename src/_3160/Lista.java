package _3160;

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
        }
        else {
            No aux = ultimo;
            aux.proximo = novo;
            ultimo = novo;
        }
        contador++;
    }

    public void adicionarAntes(String elemento, String indicacao) {
        if(contador == 0) {
            adicionar(elemento);
        }
        else {
            No aux = primeiro;
            No penultimo = null;

            while(aux != null && !aux.elemento.equals(indicacao)) {
                penultimo = aux;
                aux = aux.proximo;
            }
            if(aux == null) {
                adicionar(elemento);
            }
            else if(aux == primeiro) {
                No novo = new No(elemento);
                novo.proximo = aux;
                primeiro = novo;
                contador++;
            }
            else {
                No novo = new No(elemento);
                penultimo.proximo = novo;
                novo.proximo = aux;
                contador++;
            }

            /*
            public void add(int elemento, int index){
                for(int i = 0; i < index; i++) {

                }
            }
             */
            // A B Carlos X
            // A B C Carlos X
            // A B C D Carlos X
        }

    }

    @Override
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
