package semana2.fundamentos;

public class notacaoPonto {
    public static void main(String[] args) {
        //mudanças na exercicios.exercicios.semana2.resumo.fundamentos.string em linhas
        String s = "Boa noite, X";
        s = s.toUpperCase();
        System.out.println(s);

        //mudanças na exercicios.exercicios.semana2.resumo.fundamentos.string por notação ponto (quebra de linhas)
        String a = "Ola, X"
                .replace("X", "fortnite");
        System.out.println(a);
    }
}
