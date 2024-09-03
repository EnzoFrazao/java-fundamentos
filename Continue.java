package semana3.fundamentos;

public class Continue {
    public static void main(String[] args) {

//        o continue interrompe apenas a interação que esta inserido
//        exemplo: o continue fara com que o laço não execute a expressao quando "i % 2 for == 1"
        for (int i = 0; i<10; i++){
            if (i % 2 == 1){
                continue;
            }
        }
//        exemplo: o continue interrompe a execução da linha 5 do laço
        for (int i = 0; i<10; i++){
            if (i == 5){
                continue;
            }
        }
    }
}
