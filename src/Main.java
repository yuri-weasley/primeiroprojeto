//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /*  ANOTAÇÕES
        O JDK (Java Development Kit) é um conjunto de ferramentas e bibliotecas de software que permite o desenvolvimento de aplicativos Java.

        O Java é uma plataforma de programação poderosa e versátil, com quase 30 anos de história e evolução.
        Artigo: https://www.alura.com.br/artigos/java

        Existem diversas funcionalidades que podemos utilizar no IntelliJ IDEA no cotidiano que aumentam a produtividade no trabalho em projetos Java.
        Artigo: https://www.alura.com.br/artigos/intellij-idea-dicas-truques-usar-no-dia-a-dia

        A JVM é uma ferramenta muito importante no mundo Java, pois ela permite que uma aplicação possa ser executada em múltiplos sistemas operacionais
        distintos.
        Artigo: https://www.alura.com.br/artigos/jvm-conhecendo-processo-execucao-de-codigo

        Convenções de código:
        - Classes iniciam com letras maiúsculas e usa-se o PascalCase,
        - variáveis e métodos, com letras minúsculas. Se as variáveis tem nomes compostos, usa-se o camelCase,
        - CONSTANTES são escritas com todas as letras maiúsculas

        Operadores de incremento:
        Além dos operadores citados anteriormente (atribuição, aritméticos, relacionais e lógicos), o operador de incremento é usado para aumentar o valor
        de uma variável em 1. Existem dois tipos de operadores de incremento: o operador de pré-incremento (++variavel) e o operador de pós-incremento
        (variavel++).
        O operador de pré-incremento (++variavel) aumenta o valor da variável em 1 antes de usar a variável em uma expressão.
        Já o operador de pós-incremento (variavel++) aumenta o valor da variável em 1 depois de usar a variável em uma expressão.
    */
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
    }
}