package com.neto.javaintermediario.enumeradores.desafio;

public class Teste {
    
    public static void main(String[] args) {
        
        for(OperacoesMatematicas op : OperacoesMatematicas.values())
        {
            double x = 5;
            double y = 10;

            System.out.println(" x "+op+" y = "+op.executarOperacao(x, y));
        }

    }

}
