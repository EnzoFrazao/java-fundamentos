package semana2.exercicios;

import java.util.Scanner;

public class desafioBaskara {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor de a: ");
        double a = entrada.nextDouble();
        System.out.println("Digite o valor de b: ");
        double b = entrada.nextDouble();
        System.out.println("Digite o valor de c: ");
        double c = entrada.nextDouble();

        double bq = (int) Math.pow(b,2);

        double delta = bq -4*a*c;
        double baskarap = (-b + delta)/2*a;
        double baskaran = (-b - delta)/2*a;

        System.out.printf("Os valores possiveis para X são: %.2f e %.2f", baskarap, baskaran);
        entrada.close();
    }
}
