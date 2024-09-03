package semana3.fundamentos;

public class Break {
    public static void main(String[] args) {


//        break serve como quebra no laço for
//        exemplo: quando o laço chegar a 5, o ciclo se interromperá
        for (int i = 0; i < 10; i++ ){
            if (i == 5){
                break;
            }
            System.out.println(i);
        }

    }

}
