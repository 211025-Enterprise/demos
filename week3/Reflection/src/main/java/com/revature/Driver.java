package com.revature;

import com.revature.model.User;
import com.revature.util.ClassCreator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        //ClassInspector.inspectClass(User.class);

        User u = null;

        try {
            u = (User)ClassCreator.getInstance(User.class); // create an instance of user
            u.setId(20);


            // retrieve the private method that matches the name setPassword
            Method setPassword = Arrays.stream(u.getClass().getDeclaredMethods())
                    .filter(method -> method.getName().equals("setPassword")).findFirst().orElse(null);
            // because it is private, we can't invoke it unless we set it accessible

            setPassword.setAccessible(true);

            // invoke or call the method on behalf of an object that you supply as an argument along with arguments to be
            // use as arguments in the method being invoked.
            setPassword.invoke(u, "peanuts");
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println(u);
    }
}
