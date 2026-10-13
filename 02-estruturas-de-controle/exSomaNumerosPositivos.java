package semana3.exercicios;

//Criar um programa que enquanto estiver recebendo números positivos,
// imprime no console a soma dos números inseridos, caso receba um número negativo,
// encerre o programa. Tente utilizar a estrutura do while.

import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.util.Scanner;

public class exSomaNumerosPositivos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número positivo para continuar e um negatico para parar");
        int num = 0;
        int total = 0;

        while (num>=0){
            System.out.println("Digite um número: ");
            num = entrada.nextInt();
            if (num >=0){
                total += num;
                System.out.println(total);
            }
        }
        System.out.println("Número inválido");

        entrada.close();

    }
}
