package semana3.exercicios;

import java.util.Scanner;

public class exNumeroPrimo {
    public static void main(String[] args) {

        int divisores = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero");
        int num = entrada.nextInt();

        for (int i = 2; i<num; i++){
            if (num %i == 0){
                divisores++;
            }
        }

        if (divisores == 0)
            System.out.println("O número é primo");

        else
            System.out.println("O número não é primo");

        entrada.close();
    }
}
