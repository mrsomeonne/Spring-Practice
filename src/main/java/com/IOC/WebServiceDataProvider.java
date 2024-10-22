package com.IOC;

public class WebServiceDataProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        return "Fetching data from Web Service";
    }

}
