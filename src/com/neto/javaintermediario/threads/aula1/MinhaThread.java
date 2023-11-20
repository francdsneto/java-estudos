package com.neto.javaintermediario.threads.aula1;

public class MinhaThread extends Thread {

    private String nome;
    private Integer tempo;

    public MinhaThread(String nome, Integer tempo) {
        this.nome = nome;
        this.tempo = tempo;
        start();
    }    

    public void run() {

        for(int i = 0; i<6; i++)
        {
            System.out.println(nome + " contador " + i);
            
            try {
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
            
        System.out.println(nome + " terminou a execução!");

    }
    
}
