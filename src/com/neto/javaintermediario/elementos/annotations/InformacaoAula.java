package com.neto.javaintermediario.elementos.annotations;

public @interface InformacaoAula {
    
    String autor();

    int aulaNumero();

    String blog() default "http://www.teste.com.br";

    String site() default "http://teste.com.br";

}
