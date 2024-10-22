package com.IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCExample {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationUserManager.xml");

        UserManager userManagerWithDB = (UserManager) context.getBean("userManagerWithUserDatabaseProvider");
        System.out.println(userManagerWithDB.getUserInfo());

        UserManager userManagerWithWS = (UserManager) context.getBean("userManagerWithWebServiceDataProvider");
        System.out.println(userManagerWithWS.getUserInfo());

        UserManager userManagerWithNewDp = (UserManager) context.getBean("userManagerWithNewDatabaseProvider");
        System.out.println(userManagerWithNewDp.getUserInfo());
    }
}
