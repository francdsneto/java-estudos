package com.neto.javaintermediario.elementos.annotation2.annotationonclass;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *  Target:
 * 
 *  Informa o tipo de elemento java que essa anotação é válida para ser adicionada
 *  Usa-se ElementType.Type para informar que só pode ser usado em uma classe
 *  
 *  Retention:
 * 
 *  Informa ao java onde ficará retido a anotação.
 * 
 *  Em 99.9% dos casos se usa o RetentionPolicy.RUNTIME que indica que a anotação será
 *  visivel enquanto a aplicação estiver em execução
 * 
 *  A opção RetentionPolicy.SOURCE significa que a anotação será visivel ao java antes de do programa ser compilado
 *  e isso se aplica mais para anotações como a SupressWarning, por exemplo.
 * 
 *  RetentionPolicy.CLASS significa que o java terá acesso a anotação durante a compilação e após a compilação o java se livra
 *  da anotação
 * 
 */ 
@Target( { ElementType.TYPE, ElementType.METHOD } )
@Retention(RetentionPolicy.RUNTIME)
public @interface VeryImportant {
    
}
