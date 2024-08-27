package semana2.exercicios;

import java.util.Scanner;

public class desafioQuadradoCubo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num1 = entrada.nextDouble();
        double q = (int) Math.pow(num1,2);
        double c = (int) Math.pow(num1,3);

        System.out.printf("O quadrado do número é %.2f e o cubo é %.2f ", q, c);
        entrada.close();
    }
}
