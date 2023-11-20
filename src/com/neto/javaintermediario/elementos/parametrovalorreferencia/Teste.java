package com.neto.javaintermediario.elementos.parametrovalorreferencia;

public class Teste {
    
    public static void main(String[] args) {

        Contato contato = new Contato("Teste COntato", "1111-1111", "email@email.com");
        int valor = 10;

        System.out.println(contato);
        System.out.println(valor);

        testePassagemValorReferencia(valor, contato);

        System.out.println(contato);
        System.out.println(valor);

        testePassagemValorReferencia2(valor, contato);

        System.out.println(contato);
        System.out.println(valor);

    }

    public static void testePassagemValorReferencia(int valor, Contato contato) {

        int novoValor = valor + 10;
        valor = novoValor;

        contato = new Contato("Neto", "9999-9999", "teste@teste.com");


    }

    public static void testePassagemValorReferencia2(int valor, Contato contato) {

        int novoValor = valor + 10;
        valor = novoValor;

        contato.setNome("Neto"+novoValor);


    }

}
