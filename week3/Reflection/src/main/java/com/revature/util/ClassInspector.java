package com.revature.util;

import java.lang.reflect.*;
import java.util.Arrays;

public class ClassInspector {

    public static void inspectClass(Class<?> clazz){
//        listPublicConstructors(clazz);
//        listPublicFields(clazz);
//        listPublicMethods(clazz);
        listPrivateMethods(clazz);
    }

    public static void listPublicConstructors(Class<?> clazz){
        System.out.println("Printing public constructors of: " + clazz.getName());
        Constructor<?>[] constructors = clazz.getConstructors();
        for(Constructor<?> constructor : constructors){
            System.out.println("\tConstructor name: " + constructor.getName());
            System.out.println("\tConstructor param types: " + Arrays.toString(constructor.getParameterTypes()));
            System.out.println();
        }
    }

    public static void listPublicFields(Class<?> clazz){
        System.out.println("Printing public fields of: " + clazz.getSimpleName());
        Field[] fields = clazz.getFields();
        if(fields.length == 0){
            System.out.println("\tThere are no public fields in: " + clazz.getSimpleName());
        } else {
            for(Field field : fields){
                System.out.println("\tField name: " + field.getName());
                System.out.println("\tField type: " + field.getType().getSimpleName());
                System.out.println("\tIs primitive?: " + field.getType().isPrimitive());
                System.out.println("\tModifiers: " + field.getModifiers());
                System.out.println("\tAnnotations: " + Arrays.toString(field.getDeclaredAnnotations()));
                System.out.println();
            }
        }
    }

    public static void listPublicMethods(Class<?> clazz){
        System.out.println("Printing public methods of: " + clazz.getSimpleName());
        Method[] methods = clazz.getMethods();
        if(methods.length == 0){
            System.out.println("\tThere are no public methods in: " + clazz.getSimpleName());
        } else {
            for(Method method: methods){
                System.out.println("\tMethod name: " + method.getName());
                System.out.println("\tReturn type: " + method.getReturnType());
                System.out.println("\tParameter Count: " + method.getParameterCount());
                System.out.println("\tDeclaring Class: " + method.getDeclaringClass());
                System.out.println("\tDeclared Annotations: " + Arrays.toString(method.getDeclaredAnnotations()));

                Parameter[] params = method.getParameters();
                for(Parameter param : params){
                    System.out.println("\tField name: " + param.getName());
                    System.out.println("\tField type: " + param.getType().getSimpleName());
                    System.out.println("\tIs primitive?: " + param.getType().isPrimitive());
                    System.out.println();
                }
                System.out.println();
            }
        }
    }

    public static void listPrivateMethods(Class<?> clazz){
        System.out.println("Printing private methods of: " + clazz.getSimpleName());
        Method[] methods = clazz.getDeclaredMethods();
        if(methods.length == 0){
            System.out.println("\tThere are no public methods in: " + clazz.getSimpleName());
        } else {
            for(Method method: methods){

                if((method.getModifiers() & Modifier.PUBLIC) == Modifier.PUBLIC)
                    continue;

                System.out.println("\tMethod name: " + method.getName());
                System.out.println("\tReturn type: " + method.getReturnType());
                System.out.println("\tParameter Count: " + method.getParameterCount());
                System.out.println("\tDeclaring Class: " + method.getDeclaringClass());
                System.out.println("\tDeclared Annotations: " + Arrays.toString(method.getDeclaredAnnotationsByType(Override.class)));

                Parameter[] params = method.getParameters();
                for(Parameter param : params){
                    System.out.println("\tField name: " + param.getName());
                    System.out.println("\tField type: " + param.getType().getSimpleName());
                    System.out.println("\tIs primitive?: " + param.getType().isPrimitive());
                    System.out.println();
                }
                System.out.println();
            }
        }
    }
}
