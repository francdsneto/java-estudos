package com.neto.javaintermediario.elementos.autoboxingunboxing;

public class TesteAutoBoxingUnboxing {
    
    public static void main(String[] args) {

        /**
         * Auto-Boxing - transforma primitivo em classe
         */
        Short num7 = 1;
        Byte num8 = 10;
        Integer num9 = 100; 
        Long num10 = 1000l;
        Float num11 = 3.5f;
        Double num12 = 3.5555;
        Boolean flag2 = true;
        Character a3 = 'a';
        
        /**
         * Auto-Unboxing - Transforma classe em primitivo
         */
        short nump7 = new Short((short)1); 
        byte nump8 = new Byte((byte) 10); 
        int nump9 = new Integer(100); 
        long nump10 = new Long(1000l);
        float nump11 = new Float(3.5f);
        double nump12 = new Double(3.5555);
        boolean flagp2 = new Boolean(true);
        char ap3 = new Character('a');

    }

}
