package semana3.exercicios;

//Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100.
// Armazene um numero aleatório em uma variável.
// O Jogador tem 10 tentativas para adivinhar o número gerado.
// Ao final de cada tentativa, imprima a quantidade de tentativas restantes,
// e imprima se o número inserido é maior ou menor do que o número armazenado.

import javax.swing.*;
import java.util.Scanner;

public class exJogoAdivinhação {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero de 0 a 100");
        int num = entrada.nextInt();

        externo:
        for (int i = 0; i < 10; i++) {
            System.out.println("Faça um chute: ");
            int chute = entrada.nextInt();
            if (chute == num) {
                System.out.printf("Você acertou em: %d tentativas", i);
                break externo;
            } else if (chute > num) {
                System.out.println("Chute mais baixo");
            } else System.out.println("Chute mais alto");
        }
        entrada.close();
    }
}

