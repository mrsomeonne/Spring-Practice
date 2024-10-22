package com.IOC;

public class NewDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        return "New Database has connected";
    }
}
