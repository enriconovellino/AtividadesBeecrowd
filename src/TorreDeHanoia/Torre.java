package TorreDeHanoia;

public class Torre {
    // n é o número de discos que tenho em um dos três pilares da torre
    // origem é onde os discos se encotram
    // destino vai ser para onde eu vou mover os meus discos
    // auxiliar vai ser o pilar onde vai servir para ajudar
    public void deHanoia(int n, String origem, String destino, String auxiliar) {
        if(n == 1) {
            System.out.println("Mova o disco 1 da estaca " + origem + " para a estaca " + destino);
            return;
        }
        deHanoia(n-1, origem, destino, auxiliar);
        System.out.println("Mova o disco " + n + " da estaca " + origem + " para a estaca " + destino);
        deHanoia(n-1, auxiliar, destino, origem);
    }
}
