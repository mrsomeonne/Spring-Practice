package com.tight.coupling;

// A - MySQL, PostgreSQL
// B - MongoDB, Web Service

public class UserDatabase {
    public String getUserDetails(){
        //Directly access database here
        return  "User Details From Database";
    }
}
