package semana2.exercicios;

import java.util.Scanner;

public class desafioFahreinheitCelsius {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma temperatura em graus Fahreinheit: ");
        double tempF = Double.parseDouble(entrada.next());
        double conversao = (tempF - 32) / 1.8;
        System.out.println("A temperatura em graus Celsius é: "+conversao);
        entrada.close();
    }
}