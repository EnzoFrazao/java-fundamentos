package semana3.exercicios;

import semana3.fundamentos.SwitchComBreak;

import java.util.Scanner;

public class exNumeroPrimoSwitch {
    public static void main(String[] args) {

        int divisores = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero");
        int num = entrada.nextInt();

        for (int i = 2; i<num; i++){
            if (num %i == 0){
                divisores++;
            }
        }

        switch (divisores){
            case 0:
                System.out.println("Número é primo");
                break;
            default:
                System.out.println("Número não é primo");
        }

        entrada.close();
    }
}
