package com.neto.javaintermediario.elementos.classesaninhadas;

import com.neto.javaintermediario.elementos.classesaninhadas.interfaceexemplo.Texto;

public class Anonima {

    public void imprimeTexto() {
        System.out.println("qualquer texto");
    }

    public static void main(String[] args) {
        
        Anonima anonima = new Anonima() {
            public void imprimeTexto() {
                System.out.println("Imprime qualquer texto sobrescrito da classe principal");
            }
        };

        anonima.imprimeTexto();

        //Usando uma interface

        Texto texto = new Texto() {
            @Override
            public void imprimeTexto() {
                System.out.println("Imprimo texto de uma interface");                
            }
        };

        texto.imprimeTexto();

    }
    
}
