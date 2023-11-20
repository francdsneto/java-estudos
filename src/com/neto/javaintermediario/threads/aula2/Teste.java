package com.neto.javaintermediario.threads.aula2;

public class Teste {
        
    public static void main(String[] args) {
        
        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("Thread #1", 500);

        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("Thread #2", 600);

        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("Thread #3", 800);

        

    }

}
