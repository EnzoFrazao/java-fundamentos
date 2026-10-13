package semana3.fundamentos;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {

        //While indeterminado = executa uma operação até que um novo dado seja atribuido para interromper o programa

        Scanner entrada = new Scanner(System.in);

        String valor = "";

        while (!valor.equalsIgnoreCase("parar")){ //enquanto a palavra "parar" nao for escrita, o codigo continuará
            System.out.println("ola");
            valor = entrada.nextLine();
        }

        entrada.close();
    }
}
