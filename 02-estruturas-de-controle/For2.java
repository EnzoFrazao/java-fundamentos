package semana3.fundamentos;

public class For2 {
    public static void main(String[] args) {

        //        For crescente
        for (int contador = 1; contador<=10; contador++){
            System.out.printf("numero: %d\n", contador);
        }

        //        For decrescente
        for (int i = 10; i>=0; i -= 2){
            System.out.printf("numero = %d\n", i);
        }

        //        For crescente -> sinal de ">"
        //        For decrescente -> sinal de "<"

        //        Variavel dentro ou fora do laço
        for (int a = 10; a<20; a++){            //nesse exemplo a variavel esta dentro do laço e não pode ser alterada
            System.out.println(a);
        }

        int b = 1;
        for (; b<10; b++){             //nesse exemplo a variavel esta fora do laço,
            System.out.println(b);     //podendo ser alterada antes e depois
        }
        b = 1;


        //        For dentro de for (laço duplo)
        for (int c = 0; c<2; c++){
            for (int d = 0; d<2; d++){
                System.out.printf("[d% %d]", c, d);
            }
        }
        //nesse exemplo o for da variavel "c" ira correr 2x, fazendo com que o o for da variavel "d" corra 4x.
    }
}
