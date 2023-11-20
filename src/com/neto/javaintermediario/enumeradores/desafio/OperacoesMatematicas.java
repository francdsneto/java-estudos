package com.neto.javaintermediario.enumeradores.desafio;

public enum OperacoesMatematicas {

    SOMA('+') {

        public double executarOperacao(double x, double y) {
            return x+y;
        }

    },SUBTRACAO('-') {

        public double executarOperacao(double x, double y) {
            return x-y;
        }

    },MULTIPLICACAO('*') {

        public double executarOperacao(double x, double y) {
            return x*y;
        }

    },DIVISAO('/') {

        public double executarOperacao(double x, double y) {
            return x/y;
        }

    };

    private char tipoOperacao;

    private OperacoesMatematicas(char tipoOperacao)
    {
        this.tipoOperacao = tipoOperacao;
    }

    public abstract double executarOperacao(double x, double y);

    @Override
    public String toString() {
        return ""+tipoOperacao;
    }

}
