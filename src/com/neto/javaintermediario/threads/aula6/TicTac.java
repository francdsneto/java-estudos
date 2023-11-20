package com.neto.javaintermediario.threads.aula6;

public class TicTac {

    boolean tic;

    synchronized void tic(boolean estaExecutando) {

        if(!estaExecutando)
        {
            tic = true;
            notify();
            return;
        }

        System.out.print("Tic ");

        tic = true;

        notify();

        while (tic) {

            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
    } 

    synchronized void tac(boolean estaExecutando) {
        
        if(!estaExecutando)
        {
            tic = false;
            notify();
            return;
        }

        System.out.println("Tac ");

        tic = false;

        notify();

        while (!tic) {

            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
    } 
    
}
