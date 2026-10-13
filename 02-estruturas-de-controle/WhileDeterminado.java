package semana3.fundamentos;

public class WhileDeterminado {
    public static void main(String[] args) {

        //While determinado= executa uma operação verdadeira até que ela se torne false (tem um limite)

        int contador = 1;

        while(contador<=10) {
            System.out.printf("bom dia = %d\n ", contador);
            contador++;
        }
    }
}