package semana2.fundamentos;

public class igualdadeStrings {
    public static void main(String[] args) {

        System.out.println("2" == "2"); //resultado: true

        String s = new String("2");
        System.out.println("2" == s); //resultado: false  -> o conteudo de "s" não é analisado
        System.out.println("2".equals(s)); //resultado: true  -> o conteudo de "s" é analisado

        // == verifica o local de armazenamento
        // x = 0
        // y = 0
        // (x == y)  -> false  -> apesar de terem o mesmo valor, ocupam locais diferentes no armazenamento


        // equals verifica o valor dos objetos
        // x = 0
        // y = 0
        // (x.equals(y)) -> true  -> ambos tem o mesmo conteudo, e não importa o local de armazenamento
    }
}
