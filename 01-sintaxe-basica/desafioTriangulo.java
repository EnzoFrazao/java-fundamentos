package semana2.exercicios;

import java.util.Scanner;

public class desafioTriangulo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor da base de um triangulo: ");
        double base = entrada.nextDouble();
        System.out.println("Digite o valor da altura de um triangulo: ");
        double altura = entrada.nextDouble();
        var resultado =  (base * altura)/2;
        System.out.println("O valor da área do triangulo é: "+ resultado);
        entrada.close();
    }
}
