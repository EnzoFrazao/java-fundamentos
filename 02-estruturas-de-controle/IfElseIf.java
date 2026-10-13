package semana3.fundamentos;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma nota: ");
        double nota = entrada.nextDouble();

        if (nota >10.0 || nota < 0.0)
            System.out.println("Nota inválida");

        else if (nota >= 7.0) {
            System.out.println("Você foi aprovado");
        }
        else if (nota <= 6.9 && nota >=4.0) {
            System.out.println("Você esta de recuperação");
        }
        else if (nota <= 3.9) {
            System.out.println("Você esta de reprovado");
        }

        entrada.close();
    }
}
