package com.neto.javaintermediario.elementos.wrappers;

public class TesteWrapper {
    
    public static void main(String[] args) {
        
        short num1 = 1;
        byte num2 = 10;
        int num3 = 100;
        long num4 = 1000l;
        float num5 = 3.5f;
        double num6 = 3.5555;
        boolean flag = true;
        char a = 97;
        char a2 = 'a';

        Short num7 = new Short((short) 1); // new Short(num1);
        Byte num8 = new Byte((byte) 10); // new Byte(num2);
        Integer num9 = new Integer(100); // new Integer("100");
        Long num10 = new Long(1000l);
        Float num11 = new Float(3.5f);
        Double num12 = new Double(3.5555);
        Boolean flag2 = new Boolean(true);
        Character a3 = new Character('a');

    }

}
