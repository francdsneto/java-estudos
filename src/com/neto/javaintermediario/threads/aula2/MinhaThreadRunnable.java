package com.neto.javaintermediario.threads.aula2;

public class MinhaThreadRunnable implements Runnable {

    private String nome;
    private int valorAdormecida;

    public MinhaThreadRunnable(String nome, int valorAdormecida) {
        this.nome = nome;
        this.valorAdormecida = valorAdormecida;
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        
        System.out.println("Thread Iniciada");

        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(nome + " tem contador valor " + i);                
                Thread.sleep(valorAdormecida);
            }
        } catch (Exception e) {
            System.out.println(nome + "foi interrompida");
        }

        System.out.println(nome + " foi terminada");

    }
    
}
