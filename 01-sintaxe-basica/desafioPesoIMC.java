package semana2.exercicios;

import java.util.Scanner;

public class desafioPesoIMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu peso em kilos: ");
        double peso = entrada.nextDouble();
        System.out.println("Digite sua altura em metros: ");
        double altura = entrada.nextDouble();
        var resultado = peso/(altura * altura);
        System.out.println(resultado);
        entrada.close();
    }
}
