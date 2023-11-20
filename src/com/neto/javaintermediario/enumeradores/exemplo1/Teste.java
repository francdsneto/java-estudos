package com.neto.javaintermediario.enumeradores.exemplo1;

public class Teste {
    
    public static void main(String[] args) {
        usandoConstantes();
        usandoEnum();
    }

    private static void usandoConstantes() {
        
        int segunda = DiaSemanaConstantes.SEGUNDA;
        int terca = DiaSemanaConstantes.TERCA;
        int quarta = DiaSemanaConstantes.QUARTA;
        int quinta = DiaSemanaConstantes.QUINTA;
        int sexta = DiaSemanaConstantes.SEXTA;
        int sabado = DiaSemanaConstantes.SABADO;
        int domingo = DiaSemanaConstantes.DOMINGO;

        System.out.println("Teste utilizando constantes no Java");
        imprimirDiaSemana(segunda);
        imprimirDiaSemana(terca);
        imprimirDiaSemana(quarta);
        imprimirDiaSemana(quinta);
        imprimirDiaSemana(sexta);
        imprimirDiaSemana(sabado);
        imprimirDiaSemana(domingo);
        
    }

    private static void imprimirDiaSemana(int dia) {
        switch (dia) {
            case 1:
                System.out.println("Segunda-Feira");
                break;
            case 2:
                System.out.println("Terça-Feira");
                break;
            case 3:
                System.out.println("Quarta-Feira");
                break;
            case 4:
                System.out.println("Quinta-Feira");
                break;
            case 5:
                System.out.println("Sexta-Feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }
    }

    private static void usandoEnum() {

        DiaSemanaEnum segunda = DiaSemanaEnum.SEGUNDA;
        DiaSemanaEnum terca = DiaSemanaEnum.TERCA;
        DiaSemanaEnum quarta = DiaSemanaEnum.QUARTA;
        DiaSemanaEnum quinta = DiaSemanaEnum.QUINTA;
        DiaSemanaEnum sexta = DiaSemanaEnum.SEXTA;
        DiaSemanaEnum sabado = DiaSemanaEnum.SABADO;
        DiaSemanaEnum domingo = DiaSemanaEnum.DOMINGO;

        System.out.println("Teste utilizando enum no Java");
        imprimirDiaSemanaEnum(segunda);
        imprimirDiaSemanaEnum(terca);
        imprimirDiaSemanaEnum(quarta);
        imprimirDiaSemanaEnum(quinta);
        imprimirDiaSemanaEnum(sexta);
        imprimirDiaSemanaEnum(sabado);
        imprimirDiaSemanaEnum(domingo);


    }

    private static void imprimirDiaSemanaEnum(DiaSemanaEnum dia) {
        switch (dia) {
            case SEGUNDA:
                System.out.println("Segunda-Feira");
                break;
            case TERCA:
                System.out.println("Terça-Feira");
                break;
            case QUARTA:
                System.out.println("Quarta-Feira");
                break;
            case QUINTA:
                System.out.println("Quinta-Feira");
                break;
            case SEXTA:
                System.out.println("Sexta-Feira");
                break;
            case SABADO:
                System.out.println("Sábado");
                break;
            case DOMINGO:
                System.out.println("Domingo");
                break;
        }
    }

}
