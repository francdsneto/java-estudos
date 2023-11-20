package com.neto.javaintermediario.enumeradores.exemplo3;

import com.neto.javaintermediario.enumeradores.exemplo1.DiaSemanaEnum;

public class TesteEnum2 {
    
    public static void main(String[] args) {
        

        System.out.println(Enum.valueOf(DiaSemanaEnum.class,"DOMINGO"));

        DiaSemanaEnum dia = Enum.valueOf(DiaSemanaEnum.class,"DOMINGO");

        System.out.println(dia);

    }

}
