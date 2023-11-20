package com.neto.javaintermediario.threads.aula1;

public class Teste {

    public static void main(String[] args) {

        MinhaThread thread = new MinhaThread("Thread #1",500);

        MinhaThread thread2 = new MinhaThread("Thread #2",900);

        MinhaThread thread3 = new MinhaThread("Thread #3",700);

    }
    
}
