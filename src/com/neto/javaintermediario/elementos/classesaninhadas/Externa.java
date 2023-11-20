package com.neto.javaintermediario.elementos.classesaninhadas;

public class Externa {
    
    private String texto = "Texto externo";

    public class Interna {

        private String texto = "Texto interno";

        public void imprimeTexto() {
            System.out.println(texto);

            //consegue ver o membro da classe externa
            System.out.println(Externa.this.texto);
        }

    }

    public static void main(String[] args) {

        Externa externa = new Externa();

        //É preciso de uma instância da classe externa para poder instanciar a classe interna, a não ser que a interna seja estática
        Interna interna = externa.new Interna();

        interna.imprimeTexto();
    }

}
