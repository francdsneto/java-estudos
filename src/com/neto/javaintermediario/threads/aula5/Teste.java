package com.neto.javaintermediario.threads.aula5;

public class Teste {
    
    public static void main(String[] args) {
        
        int[] array = { 1,2,3,4,5 };
        MinhaThreadSoma t1 = new MinhaThreadSoma("#1", array);
        MinhaThreadSoma t2 = new MinhaThreadSoma("#2", array);
        
    }

}
