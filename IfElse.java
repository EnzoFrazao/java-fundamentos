package semana3.fundamentos;

import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Informe um número");
        int num = Integer.parseInt(valor);

        if (num % 2 == 0){
            System.out.println("Número par");
        }
        else{ //caso contrario do "IF", usado por ultimo
            System.out.println("Número impar");
        }
    }
}
