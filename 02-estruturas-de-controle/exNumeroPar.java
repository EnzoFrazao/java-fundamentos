package semana3.exercicios;

import java.util.Scanner;

public class exNumeroPar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int x = entrada.nextInt();

        if (x % 2 == 0 && x>=0 && x<=10)
            System.out.println("O número é par e está entre 0 e 10");
        else
            System.out.println("Número inválido");

        entrada.close();
    }
}
