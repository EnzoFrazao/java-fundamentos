package semana3.fundamentos;

import java.util.Scanner;

public class SwitchComBreak {
    public static void main(String[] args) {

        //Switch sem break executa somente a ação que se encaixa

        Scanner entrada = new Scanner(System.in);

        String conceito = "";
        System.out.print("Informe a nota: ");
        int nota = entrada.nextInt();

        switch (nota){
            case 10: case 9: case 8:
                conceito = "A";
                break;
            case 7: case 6:
                conceito = "B";
                break;
            case 5: case 4:
                conceito = "C";
                break;
            case 3: case 2:
                conceito = "D";
                break;
            case 1:
                conceito = "E";
                break;
            case 0:
                conceito = "F";
                break;
            default:
                conceito = "inválido";
        }
        System.out.println("O conceito é: " + conceito);
        entrada.close();
    }
}
