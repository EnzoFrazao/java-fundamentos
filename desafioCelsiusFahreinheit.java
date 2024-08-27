package semana2.exercicios;

import java.util.Scanner;

public class desafioCelsiusFahreinheit {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma temperatura em graus Celsius: ");
        double tempC = Double.parseDouble(entrada.next());
        double conversao = (tempC * 1.8) +32;
        System.out.println("A temperatura em graus Fahreinheit é: " +conversao);
        entrada.close();
    }
}
