package semana3.fundamentos;

public class BreakRotulado {
    public static void main(String[] args) {

//        o break nesse exemplo interrompe apenas o laço interno (segundo for)
        for (int i = 0; i<3; i++){
            for (int a = 0; a<3; a++){
                if (i == 1){
                    break;
                }
                System.out.printf("%d %d", i, a);
            }
        }

//        nesse caso há a rotulação dos laços, aonde o break pode interromper o laço externo mesmo estando no interno
        externo: for (int b = 0; b<3; b++){
            interno: for (int c = 0; c<3; c++){
                if (b == 1){
                    break externo;
                }
                System.out.printf("%d %d", b, c);
            }
        }
    }
}
