package com.IOC;

// A - MySQL, PostgreSQL
// B - MongoDB, Web Service

public class UserDatabaseProvider implements UserDataProvider {

    public String getUserDetails(){
        //Directly access database here
        return  "User Details From Database";
    }
}
