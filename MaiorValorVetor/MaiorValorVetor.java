package MaiorValorVetor;

public class MaiorValorVetor {
    public int max(int[] vetor, int n) {
        //                          = 6
        // caso de parada
        if(n == 0){
            return vetor[0];
        }
        // Previne múltiplas recursividades
        int maior = max(vetor, n - 1);

        if ( vetor[n] > maior ) {
            return vetor[n];
        } else {
            return maior;
        }
        
        /*
        Tendo como caso de análise max(vetor, 6):
        Como vetor = {3,7,5,1,9,2,4}, então n = 6 -> de 0 a 6, ou seja, temos 7 elementos
                      0,1,2,3,4,5,6

        max(vetor, 6) {
                        vetor[6] -> 4
                            ou
                        max(vetor, 5)
                        {
                                        vetor[5] -> 2
                                            ou
                                         max(vetor, 4)
                                         {
                                                        vetor[4] -> 9
                                                            ou
                                                        max(vetor, 3)
                                                        {
                                                                        vetor[3] -> 1
                                                                            ou
                                                                        max(vetor, 2)
                                                                        {
                                                                                        vetor[2] -> 5
                                                                                            ou
                                                                                        max(vetor, 1)
                                                                                        {
                                                                                                        vetor[1] -> 7
                                                                                                            ou
                                                                                                        max(vetor, 0)

         */
    }
}
