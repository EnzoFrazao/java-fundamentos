package semana2.fundamentos;

public class string {
    public static void main(String[] args) {
        String x = "Ola mundo, esse é o novo mundo";
        System.out.println(x.length()); //numero de caracteres
        System.out.println(x + "concatenada"); //mesclar duas strings
        System.out.println(x.contains("novo")); //verifica se há uma palavra/caracter na exercicios.exercicios.semana2.resumo.fundamentos.string
        System.out.println(x.indexOf("mundo")); //indica aonde se inicia a palavra selecionada
        System.out.println(x.lastIndexOf("mundo")); //indica o indice da ultima vez que a palavra apareceu
        System.out.println(x.toUpperCase()); //deixa tudo em caixa alta
        System.out.println(x.toLowerCase()); //deixa tudo em caixa baixa
        System.out.println(x.trim()); //remove os espaços " " desnecessários
        System.out.println(x.substring(9)); //printa a exercicios.exercicios.semana2.resumo.fundamentos.string a partir do caracter definido
        System.out.println(x.equals("Ola")); //compara a exercicios.exercicios.semana2.resumo.fundamentos.string com a palavra selecionada
    }
}
