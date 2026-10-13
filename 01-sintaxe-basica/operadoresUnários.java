package semana2.operadores;

public class operadoresUnários {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        a++; // a = a + 1
        a--; // a = a - 1

        ++b; // b = b + 1
        --b; // b = b - 1

        //a precedencia de prefix é maior que pos fix (grau de importancia -- igual a "*" e "/" em relação a "+" e "-")
        //ex: (++a == b--), o codigo é lido da esquerda para direita, então o resultado será basicamente: (++a == b)
    }
}
