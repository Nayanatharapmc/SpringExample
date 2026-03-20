package com.loose.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingExample {
    public static void main(String[] args){
        // This is inversion of control. Bean creation and management done by Spring Framework
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationLooseCouplingInjection.xml");

        UserManager userManagerWithDB = (UserManager) context.getBean("databaseProvider");
        System.out.println(userManagerWithDB.getUserInfo());

        UserManager userManagerWithWeb = (UserManager) context.getBean("webServiceDataProvider");
        System.out.println(userManagerWithWeb.getUserInfo());

        UserManager userManagerWithNewDB = (UserManager) context.getBean("newDBProvider");
        System.out.println(userManagerWithNewDB.getUserInfo());
    }
}
