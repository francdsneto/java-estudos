package com.neto.javaintermediario.elementos.annotation2.annotationonmethod;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotations aceitam como tipo de retorno do método apenas tipos primitivos e classes
 * Wrappers do tipo primitivo, não é possível passar uma classe Cat ou Dog, por exemplo.
 * 
 * Para retornar array, usase braquets []
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RunImmediately {
    int times() default 1;
}
