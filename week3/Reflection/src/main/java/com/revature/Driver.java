package com.revature;

import com.revature.model.User;
import com.revature.util.ClassInspector;

public class Driver {
    public static void main(String[] args) {
        ClassInspector.inspectClass(User.class);
    }
}
