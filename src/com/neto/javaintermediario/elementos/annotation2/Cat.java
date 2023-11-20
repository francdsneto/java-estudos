package com.neto.javaintermediario.elementos.annotation2;

import com.neto.javaintermediario.elementos.annotation2.annotationonclass.VeryImportant;
import com.neto.javaintermediario.elementos.annotation2.annotationonfield.ImportantString;
import com.neto.javaintermediario.elementos.annotation2.annotationonmethod.RunImmediately;

@VeryImportant
public class Cat {

    @ImportantString
    public String name;
    public Integer age;
    public String race;

    public Cat(String name, Integer age, String race) {
        this.name = name;
        this.age = age;
        this.race = race;
    }

    @RunImmediately(times = 3)
    public void meow() {
        System.out.println("Meow!");
    }

    public void eat() {
        System.out.println("Nham Nham!");
    }
    
}
