package com.neto.javaintermediario.elementos.varargs;

public class ExemploVarargs {
    
    public static void main(String[] args) {
     
        System.out.println(soma(1,2,3,4,5));

    }

    public static int soma(Integer... valores) {

        int total = 0;

        for(int i = 0; i < valores.length; i++)
        {
            total += valores[i];
        }

        return total;

    }

}
