package semana2.fundamentos;

import java.util.Scanner;

public class comparandoStrings {
    public static void main(String[] args) {
        //comparando strings
        String password = "123456"; //string literal (não há objetos)
        System.out.print("Digite sua senha: ");

        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();

        System.out.println(password.equals(pass)); //comparação de conteudo
        System.out.println(password == pass); // "==" em java compara local de armazenamento, não o conteudo.
        //exemplo: string password está armazenado no #001, e a exercicios.exercicios.semana2.resumo.fundamentos.string pass está em #100, então o "==" irá
        //apontar que a string password é diferente da pass, mesmo tendo o mesmo conteudo


        //exemplo pratico
        String x = new String("123456");
        String y = new String("123456");

        System.out.println(x == y);
        //resultado = false > pois estão armazenados em locais difrentres
        String w = new String("123456");
        String z = new String("123456");

        System.out.println(w.equals(z));
        //resultado = true > pois apresentam o mesmo conteudo
    }
}
