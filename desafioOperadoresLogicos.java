package semana2.exercicios;

public class desafioOperadoresLogicos {
    public static void main(String[] args) {

        boolean trabalho1 = false;
        boolean trabalho2 = true;

        boolean sorvete = (trabalho1 || trabalho2);
        boolean tv32 = (trabalho1 ^ trabalho2);
        boolean tv50 = !(trabalho1 ^ trabalho2);

        System.out.println("Sorvete compradro:"+sorvete);
        System.out.println("Tv de 32 compradra:"+tv32);
        System.out.println("Tv de 50 compradra:"+tv50);
    }
}
