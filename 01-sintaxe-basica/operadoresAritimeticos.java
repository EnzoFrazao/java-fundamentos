package semana2.operadores;

public class operadoresAritimeticos {
    public static void main(String[] args) {
        //operadores aritimeticos sao usados para operações matematicas
        var x = 6.45;
        double y = 2.3;

        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x/ (int) y);

        int a = 9;
        int b = 4;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a/ (double) b);

        System.out.println(a % b); //módulo (restante da divisão)

    }
}
