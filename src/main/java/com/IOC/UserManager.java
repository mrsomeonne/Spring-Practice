package com.IOC;

public class UserManager {

//    private UserDatabaseProvider userDatabase = new UserDatabaseProvider();
//    public String getUserInfo(){
//        return userDatabase.getUserDetails();
//    }

    private UserDataProvider userDataProvider;

    //Creating a constructor
    public UserManager(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }

    public String getUserInfo(){
      return   userDataProvider.getUserDetails();

    }
}
