package com.neto.javaintermediario.elementos.annotation2;

import com.neto.javaintermediario.elementos.annotation2.annotationonclass.VeryImportant;
import com.neto.javaintermediario.elementos.annotation2.annotationonfield.ImportantString;
import com.neto.javaintermediario.elementos.annotation2.annotationonmethod.RunImmediately;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.neto.javaintermediario.elementos.annotation2.Cat;

public class CreatingAnnotation {
    
    public static void main(String[] args) {
        
        Cat myCat = new Cat("Filomeno", 2, "Angorá");

        if(myCat.getClass().isAnnotationPresent(VeryImportant.class))
        {
            System.out.println("Essa classe é muito importante");
        }
        else
        {
            System.out.println("Essa classe não é muito importante");
        }

        for(Method method : myCat.getClass().getDeclaredMethods()) {
            
            if(method.isAnnotationPresent(RunImmediately.class))
            {
                try {
                    RunImmediately annotation = method.getAnnotation(RunImmediately.class);

                    for(int i = 0; i < annotation.times(); i++)
                    {
                        method.invoke(myCat);
                    }                   
                } catch (IllegalAccessException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IllegalArgumentException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        }

        for(Field field : myCat.getClass().getDeclaredFields())
        {
        
            try 
            {
                Object objectValue = field.get(myCat);

                if(objectValue instanceof String stringValue) 
                {
                    if(field.isAnnotationPresent(ImportantString.class))
                    {
                        System.out.printf("O field %s é uma String importante!" , stringValue.toUpperCase());
                    }
                    
                }

                
            } catch (IllegalArgumentException | IllegalAccessException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            
        }

    }

}
