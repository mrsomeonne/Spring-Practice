package com.loose.coupling;

// A - MySQL, PostgreSQL
// B - MongoDB, Web Service

public class UserDatabaseProvider implements UserDataProvider{

    @Override
    public String getUserDetails(){
        //Directly access database here
        return  "User Details From Database";
    }
}
