//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento= 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluindoNoPlano = true;
        double notaDoFilme = 8.1;


        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);

        // text block Introduzido na versão 15 do Java
        String sinopse;
        sinopse = """
                Filme top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento:
                """ + anoDeLancamento;
        System.out.println(sinopse);

        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));


        String nome1 = "João";
        int aulas = 4;

        String mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nome1, aulas);

        System.out.println(mensagem);
//Existem dois tipos de casting, o casting implícito e o explícito.
//Quando precisamos efetivamente dizer para ele, é o que chamamos de casting explícito, é o que fizemos agora.
        int classificacao = (int) (media /2);
        System.out.println(classificacao);

    }
    }
