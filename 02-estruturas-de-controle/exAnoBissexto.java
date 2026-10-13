package semana3.exercicios;

import java.util.Scanner;

public class exAnoBissexto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um ano: ");
        int x = entrada.nextInt();
        if (x % 4 == 0) System.out.println("O ano é bissexto");
        else System.out.println("O ano não é bissexto");
        entrada.close();
    }
}
