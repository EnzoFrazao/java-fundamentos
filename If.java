package semana3.fundamentos;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        //IF é uma condicional que verifica se uma informação é verdadeira ou falsa

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a media obtida: ");
        double media = entrada.nextDouble();

        if (media >= 7.0) { //NAO SE COLOCA ";" DEPOIS DO PARENTESES
            System.out.println("Você foi aprovado");
            System.out.println("Parabens!");
        }
        //para codigos com mais de 1 linha dentro de condicionais é importante abrir um bloco "{}"

        if (media < 7.0)
            System.out.println("Você esta reprovado");
        //não é necessário abrir um codigo "{}" tendo em vista que há apenas uma linha de codigo

        entrada.close();
    }
}
