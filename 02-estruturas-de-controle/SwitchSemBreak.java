package semana3.fundamentos;

public class SwitchSemBreak {
    public static void main(String[] args) {

        String faixa = "preta";

        //Switch sem break executa a ação que se encaixa e todas a baixo

        switch (faixa){
            case ("preta"):
                System.out.println("preta");
            case ("marrom"):
                System.out.println("marrom");
            case ("roxa"):
                System.out.println("roxo");
            case ("verde"):
                System.out.println("verde");
            case ("laranja"):
                System.out.println("laranja");
            case ("vermelha"):
                System.out.println("vermelha");
            case ("amarela"):
                System.out.println("amarela");
//            default:
//                System.out.println("nada");
        };

    }
}
