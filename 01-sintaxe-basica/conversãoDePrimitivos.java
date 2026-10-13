package semana2.fundamentos;

public class conversãoDePrimitivos {
    public static void main(String[] args) {
        //Tipos de conversão: implícita (não há perde de informação) e explicita (há perda de informação)

        //Conversão implícita:
        //conversão do menor para o maior não há complicações (byte -> shot -> int -> long)
        //inteiro para ponto flutuante (int -> float --- 3 -> 3.0)


        //Conversão explicita:
        //conversão do maior para o menor (long -> int -> short -> byte)
        //ponto flutuante para inteiro (float -> int --- 3.2 -> 3)

        //exemplos:

        double a = 1.123456788888888; //implicita
        System.out.println(a);

        float b = 1.123456788888888F; //explicita (CAST)
        // ou
        float c = (float) 1.123456788888888;
        System.out.println(b);
        System.out.println(c);

        int d = 4;
        //byte e = d; //embora o byte suporte o numero 4, o java não analisa os valores mas sim a classe
        byte e = (byte) d; //conversão correta (explícita -- CAST)
        System.out.println(e);

        double f = 1.9;
        int g = (int) f; //explicita (CAST)
        System.out.println(g);
    }
}
