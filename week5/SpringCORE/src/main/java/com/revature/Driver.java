package com.revature;

// Driver is going our main bean
// its job is to get and print messages of the day from our MOTD service

import com.revature.service.MOTDService;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

    private MOTDService motdService;

    // with this constructor, we will utilize Spring Constructor Injection to supply the MOTDService to this class
    public Driver(MOTDService motdService){
        this.motdService = motdService;
    }

    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        // application context stores and manages all the beans that you have wired up.

        Driver driver = applicationContext.getBean("Driver", Driver.class);

        System.out.println(driver.motdService.getMotd(1));
        System.out.println(driver.motdService.getMotd(-20));

        MOTDService service = applicationContext.getBean("MOTDService", MOTDService.class);

        System.out.println(service.getMotd(1));
        System.out.println(service.getMotd(-20));

        System.out.println("driver service: " + driver.motdService);
        System.out.println("service: " + service);
    }
}
