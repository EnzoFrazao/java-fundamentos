package aaaaa.semana2.resumo.JVM.JRE;

public class siglasJava {
    public static void main(String[] args) {


        //JRE (usuario - roda as aplicações)
        //Java Runturne Enviroment
        //Componentes:
        //Biblioteca Java (prewritten code);
        //Java class loader (pega os codigos da biblioteca e manda para o JVM);

        //JVM
        //Java Virtual Machine -> um compilador que transforma o arquivo .java em arquivos .class (Bytecode)

        //JDK (desenvolvedor - cria os codigos)
        //Java Development Kit
        //Componentes:
        //JRE;
        //Java Compiler (compila os codigos .java)


        //Vida do codigo:
        //criação do codigo -> compilação(JDK) -> JVM -> rodar o programa (JRE)
        //OBS: na compilação é gerado o arquivo .class (antigo .java) -> Bytecode
        //OBS2: o JVM lê somente o Bytecode, e "transcreve" para o sistema operacional

        //Javac X Java
        //javac: comando usado no prompt para transformar o arquivo .java em Bytecode (compilador -> JDK)
        //java: comando usado para rodar o Bytecode no prompt
    }
}
