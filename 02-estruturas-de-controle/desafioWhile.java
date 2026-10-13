package semana3.exercicios;

import java.util.Scanner;

public class desafioWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double nota = 0;
        double quantidade = 0;
        double total = 0;

        while (nota != -1 ){
            System.out.println("digite uma nota: ");
            nota = entrada.nextDouble();
            if (nota != -1 && nota <=10) {
                quantidade++;
                total += nota;
            }
        }

        double media = total/quantidade;
        System.out.println("A média é: " + media);


        entrada.close();

    }
}
