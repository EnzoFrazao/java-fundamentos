package semana2.fundamentos;

import javax.swing.*;

public class conversaoStringNumero {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Digite um numero:"); //comando para "input"
        String b = JOptionPane.showInputDialog("Digite outro numero:");
        System.out.println(a + b);
        //nesse exemplo os dados inseridos estão em forma de string, então o print será uma "frase", não um calculo

        String c = JOptionPane.showInputDialog("Digite um numero:");
        String d = JOptionPane.showInputDialog("Digite outro numero:");
        double num1 = Double.parseDouble(c);
        double num2 = Double.parseDouble(d);
        System.out.println(num1 + num2);
        //nesse exemplos os dados são inseridos em forma de string, transformados em double, e depois é feito o calculo

    }   //BigDecimal é o comando que deixa o resultado mais compacto (2 casas decimais)
}
