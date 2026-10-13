package semana3.fundamentos;

public class ContinueRotulado {
    public static void main(String[] args) {


//        nesse caso há a rotulação dos laços, aonde o continue interrompe a inha expecifica do laço externo
//        e mantem o fluxo do laço
        externo:
        for (int b = 0; b < 3; b++) {
            interno:
            for (int c = 0; c < 3; c++) {
                if (b == 1) {
                    continue externo;
                }
                System.out.printf("%d %d", b, c);
            }
        }
    }
}
