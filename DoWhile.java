package semana3.fundamentos;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        // if(...) 1 sentença ou 1 bloco {}  //pode ser executado 0x ou infinitas vezes
        // while(...) 1 sentença ou 1 bloco {} //pode ser executado 0x ou infinitas vezes
        // for (...;...;...) 1 sentença ou 1 bloco {} //pode ser executado 0x ou infinitas vezes

        // do {} while (...);  //não pode ser executada 0x, necessariamente 1x será realizada


        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a palavra 'iniciar'");
        String texto = entrada.nextLine();
        do {
            System.out.println("Digite a palavra: 'sair' para parar");
            texto = entrada.nextLine();
        } while(!texto.equalsIgnoreCase("sair"));

        entrada.close();
    }
}
