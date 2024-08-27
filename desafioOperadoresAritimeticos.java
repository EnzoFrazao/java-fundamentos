package semana2.exercicios;

public class desafioOperadoresAritimeticos {
    public static void main(String[] args) {

        int a = 6 * (3+2);
        int b = (int) Math.pow(a, 2);
        int c = b/(3*2);

        int d = (1-5) * (2-7);
        int e = d/2;
        int f = (int) Math.pow(e,2);

        int g = c-f;
        int h = (int) Math.pow(g,3);

        int i = (int) Math.pow(10,3);

        int resultado = h/i;

        System.out.println(resultado);
    }
}
