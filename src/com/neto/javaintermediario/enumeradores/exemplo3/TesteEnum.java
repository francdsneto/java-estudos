package com.neto.javaintermediario.enumeradores.exemplo3;

import com.neto.javaintermediario.enumeradores.exemplo2.DiaSemanaEnumValor;

public class TesteEnum {

    public static void main(String[] args) {

        DiaSemanaEnumValor[] dias = DiaSemanaEnumValor.values();

        /* for(int i = 0; i < dias.length; i++)
        {
            System.out.println(dias[i]);
        } */

        for(DiaSemanaEnumValor dia: DiaSemanaEnumValor.values())
        {
            System.out.println(dia);
        }
        
    }
    
}
