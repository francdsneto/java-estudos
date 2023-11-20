package com.neto.javaintermediario.enumeradores.exemplo2;

public class Formulario {
    
    enum Genero {
        FEMININO('F'), MASCULINO('M');

        private char valor;

        Genero(char valor) {
            this.valor = valor;
        }

        public char getValor() {
            return valor;
        }
    }

    private String nome;
    private Genero genero;

    public Formulario() {
    }

    public Formulario(String nome, Genero genero) {
        this.nome = nome;
        this.genero = genero;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Genero getGenero() {
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    
}
