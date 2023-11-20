package com.neto.javaintermediario.elementos.printf;

public class ExemploPrintf {
    
    public static void main(String[] args) {
        
        /**
         * String = %s
         * String CAPS LOCK = %S
         * Char = %c
         * Char CAPS LOCK = %C
         * Pular linha = Em vez de \n coloca-se %n
         * Números inteiros = %d
         * Imprimir sinal positivo ou negativo = %+d
         * Imprimir sinal apenas negativo = %[espaco]d = % d
         * Completar digitos e informar quantidade minima %[completar com][quantidadedigitos]d = %05d com valor 5 imprimiria 00005
         * Separar milhares com . ou , = %,d ou %.d
         * Números de ponto flutuante = %f
         * Ponto flutuante definindo quantidade de casa decimais %[.valor]f = %.3f
         * Número monetário R$%10.2f = R$ no início, 10 digitos terminando com 2 casas decimai apos o .
         * Adicionar caractetes em branco utiliza-se um número entre o % e s = A Esquerda %20s | A Direita %-20s
         */

        System.out.printf("Meu nome é %S, eu sou de %s, e moro no %s%n", "Neto", "João Pessoa", "Ceará");

        testeMaisCompleto();

    }

    private static void testeMaisCompleto() {

        double[] precos = {1000, 123.54, 7843.456, 1, 4.1828974 };

        for(int i = 0; i < precos.length; i++)
        {
            System.out.printf("%s %02d: total de R$%,10.2f%n","Item", i+1, precos[i]);
        }

        //System.out.prinf = System.out.format

        //java.util.Formater funciona como printf

    }

}
