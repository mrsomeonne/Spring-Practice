package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {

//        UserManager userManager = new UserManager();

        // Creating object of interface and assigning object of the class
        // Whoever implements the interface can use UserManager

        //this output user detail
        UserDataProvider dataProvider = new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager(dataProvider);
        System.out.println(userManagerWithDB.getUserInfo());

        //this output web detail
        UserDataProvider webServiceProvider = new WebServiceDataProvider();
        UserManager userManagerWS = new UserManager(webServiceProvider);
        System.out.println(userManagerWS.getUserInfo());

        //this output new database detail
        UserDataProvider newDatabase = new NewDatabaseProvider();
        UserManager userManagerNDB = new UserManager(newDatabase);
        System.out.println(userManagerNDB.getUserInfo());


        //Making use of one Interface To get Info
    }
}
