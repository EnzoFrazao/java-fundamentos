package semana2.fundamentos;

import java.util.Scanner;

public class console {
    public static void main(String[] args) {
        System.out.print("Bom dia!\n"); //print nao pula linha (\n serve como comando para quebrar linha)
        System.out.print("Senhor");
        System.out.println("Ola"); //println pula linha apos aplicar o comando
        System.out.println("você");

        Scanner entrada = new Scanner(System.in); //comando para armazenar dados no sistema

        System.out.print("Digite seu nome: "); //comando para pedir ao usurario um dado
        String nome = entrada.nextLine(); //comando que ira armazenar a exercicios.exercicios.semana2.resumo.fundamentos.string que o usuario digitou

        System.out.print("Digite seu sobrenome: ");
        String  sobrenome = entrada.nextLine();

        System.out.println("\n Nome: " + nome + " " + sobrenome);
        entrada.close();
    }
}
