package com.neto.javaintermediario.enumeradores.exemplo2;

import com.neto.javaintermediario.enumeradores.exemplo2.Formulario.Genero;

public class Teste {
    
    public static void main(String[] args) {
        
        DiaSemanaEnumValor dia = DiaSemanaEnumValor.DOMINGO;

        System.out.println("O valor do Domingo é - " + dia.getValor());

        Data data = new Data(1, 4, 2016, DiaSemanaEnumValor.SEXTA);

        System.out.println("Dia da semana foi - "+data.getDia());

        System.out.println();

        Formulario form = new Formulario("Neto", Genero.MASCULINO);

        System.out.println("O Genero do "+form.getNome()+" é "+form.getGenero().getValor());

    }

}
