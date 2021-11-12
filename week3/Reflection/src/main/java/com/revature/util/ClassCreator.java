package com.revature.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class ClassCreator {

    public static Object getInstance(Class<?> clazz, Object...args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<?> noArgsConstructor = null;

        // constructor with a parameter of 0

        noArgsConstructor = Arrays.stream(clazz.getDeclaredConstructors())
                .filter( c -> c.getParameterCount() == 0)
                .findFirst().orElse(null);

        if(noArgsConstructor != null){
            return noArgsConstructor.newInstance();
        }
        return null;
    }
}
