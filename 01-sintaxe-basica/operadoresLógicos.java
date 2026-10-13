package semana2.operadores;

public class operadoresLógicos {
    public static void main(String[] args) {

        //tabela verdade

        //operador "e" (&&)
        // V && V = V
        // V && F = F
        // F && V = F
        // F && F = F

        //operador "ou" (||)
        // V || V = V
        // V || F = V
        // F || V = V
        // F || F = F

        //operador "ou exclusivo" (^)
        // V ^ V = F (igual)
        // V ^ F = V (diferente)
        // F ^ V = V (diferente)
        // F ^ F = F (igual)

        //operador "not" (!)
        // !V -> F
        // !F -> V
    }
}
