package semana2.exercicios;

import java.util.Scanner;

public class desafioCalculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num1 = entrada.nextDouble();

        System.out.println("Digite outro número: ");
        double num2 = entrada.nextDouble();

        System.out.println("Digite uma operação matemática: ");
        String op = entrada.next();

        var resultado = "+".equals(op) ? num1 + num2 : 0;
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "*".equals(op) ? num1 * num2 : resultado;
        resultado = "/".equals(op) ? num1 / num2 : resultado;
        resultado = "%".equals(op) ? num1 % num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", num1, op,num2, resultado);
        entrada.close();
    }
}
