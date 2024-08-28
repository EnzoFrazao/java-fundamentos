package semana3.exercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class desafioDiaSemana {
    public static void main(String[] args) {

        //domingo -> 1
        //quarta -> 4
        //terça -> 3

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um dia da semana");
        String dia = entrada.next();

        if (dia.equalsIgnoreCase("domingo"))
            System.out.println("1");
        else if (dia.equalsIgnoreCase("segunda")){
            System.out.println("2");
        }
        else if (dia.equalsIgnoreCase("terça")) {
            System.out.println("3");
        }
        else if (dia.equalsIgnoreCase("quarta")){
            System.out.println("4");
        }
        else if (dia.equalsIgnoreCase("quinta")){
            System.out.println("5");
        }
        else if (dia.equalsIgnoreCase("sexta")){
            System.out.println("6");
        }
        else
            System.out.println("7");

        entrada.close();

    }
}
