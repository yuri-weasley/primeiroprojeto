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

        ------- Tipos primitivos -------
        São os tipos de dados mais básicos e fundamentais da linguagem. Eles são utilizados para representar valores simples e são definidos pela
        própria linguagem.
        Java possui oito tipos primitivos diferentes: boolean, byte, char, short, int, long, float e double. Cada um desses tipos possui suas próprias
        características e faixa de valores permitidos.
        boolean
        O tipo boolean é utilizado para representar valores lógicos, podendo assumir apenas dois valores: true ou false. É utilizado em expressões
        condicionais, loops e outros casos onde se deseja avaliar se uma determinada condição é verdadeira ou falsa.
        byte
        O tipo byte é utilizado para representar valores numéricos inteiros de 8 bits. Ele possui uma faixa de valores de -128 a 127.
        char
        O tipo char é utilizado para representar caracteres individuais. Ele pode armazenar qualquer caractere Unicode e é representado por aspas
        simples ('').
        short
        O tipo short é utilizado para representar valores numéricos inteiros de 16 bits. Ele possui uma faixa de valores de -32.768 a 32.767.
        int
        O tipo int é utilizado para representar valores numéricos inteiros de 32 bits. É um dos tipos de dados mais utilizados para representar
        números inteiros em Java e possui uma faixa de valores de -2.147.483.648 a 2.147.483.647.
        long
        O tipo long é utilizado para representar valores numéricos inteiros de 64 bits. Ele é utilizado para representar valores inteiros muito
        grandes e possui uma faixa de valores de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807.
        float
        O tipo float é utilizado para representar valores numéricos de ponto flutuante, ou seja, valores com casas decimais, sendo que ocupa
        32 bits de memória. Ele pode representar números decimais com até sete dígitos e tem uma precisão limitada, o que significa que ele pode
        arredondar os números se eles forem muito grandes ou muito pequenos.
        double
        O tipo double é similar o float, entretanto ele ocupa 64 bits de memória e pode representar números decimais com até 15 dígitos.

        ------- Casting -------
        Casting é um recurso utilizado em Java para converter um tipo de dado em outro. Essa conversão pode ser feita de forma automática pelo
        compilador (conversão implícita), quando o tipo de dado de destino é compatível com o tipo de dado de origem, ou de forma manual (conversão
        explícita), utilizando o operador de casting.
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
        //Média calculada pelas 3 notas da Jack, Paulo e Suelem
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme: Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);

    }
}