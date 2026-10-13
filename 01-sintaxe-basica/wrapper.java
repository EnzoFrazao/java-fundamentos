package semana2.fundamentos;

import java.util.Scanner;

public class wrapper {
    public static void main(String[] args) {
        //Wrapper sao classes que comportam os tipos primitivos

        //Todo tipo primitivo quando iniciado com letra MAIUSCULA se transfama de inteiro para classe
        //exemplo: Byte = classe; byte = inteiro/primitivo

        //byte
        Byte b = 100;  //clase para primitivo (byte - numero)
        Short s = 1000; //clase para primitivo (short - numero)
        Integer I = 10000; //clase para primitivo (integer - numero)
        int i = 10000; // int ("I" minusculo é considerado primitivo) (primitivo - primitivo)
        Long L = 100000L; //Long so relaciona com long (long - long) *por isso deve-se colocar "L" no primitivo
        long l = 100000; // long ("L" minusculo é considerado classe) (classe - primitivo)

        //é possivel alterar entre exercicios.exercicios.semana2.resumo.fundamentos.string e valores inteiros por meio da relação entre Integer e int
        //Integer/exercicios.exercicios.semana2.resumo.fundamentos.string para int
        Scanner entrada = new Scanner(System.in);
        Integer.parseInt(entrada.next()); // comando transforma a exercicios.exercicios.semana2.resumo.fundamentos.string para o inteiro

        //float para exercicios.exercicios.semana2.resumo.fundamentos.string
        Float f = 123.0F;
        System.out.println(f.toString());

        //double para exercicios.exercicios.semana2.resumo.fundamentos.string
        Double d = 10.20;
        System.out.println(d.toString());

        //exercicios.exercicios.semana2.resumo.fundamentos.string para boolean
        Boolean bo = Boolean.parseBoolean("true");
        //boolean para exercicios.exercicios.semana2.resumo.fundamentos.string
        System.out.print(bo.toString());


        //character para exercicios.exercicios.semana2.resumo.fundamentos.string
        Character c = '#'; //char
        System.out.println(c.toString());

    }
}
