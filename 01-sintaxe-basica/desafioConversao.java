package semana2.exercicios;

import java.util.Scanner;

public class desafioConversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu primeiro salário:");
        String v1 = entrada.next().replace("," , ".");
        System.out.print("Digite seu segundo salário:");
        String v2 = entrada.next().replace("," , ".");
        System.out.print("Digite seu terceiro salário:");
        String v3 = entrada.next().replace("," , ".");

        double s1 = Double.parseDouble(v1);
        double s2 = Double.parseDouble(v2);
        double s3 = Double.parseDouble(v3);
        double media = (s1 + s2 + s3)/3;
        entrada.close();

        System.out.println("A média salarial é:" + media);
    }
}
