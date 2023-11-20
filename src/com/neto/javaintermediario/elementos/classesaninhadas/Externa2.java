package com.neto.javaintermediario.elementos.classesaninhadas;

public class Externa2 {
    
    public void metodoQualquer() {

        //Classe com escopo apenas dentro deste método
        class ClasseLocal {

            private String texto = "Classe local";

            public void imprimeTexto() {
                System.out.println(texto);
            }

        }

        ClasseLocal classeLocal = new ClasseLocal();

        classeLocal.imprimeTexto();

    }

    public static void main(String[] args) {

        Externa2 externa2 = new Externa2();

        externa2.metodoQualquer();
        
    }

}
