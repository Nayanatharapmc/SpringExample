package com.loose.coupling;

public class WebServieDataProvider implements UserDataProvider{
    @Override
    public String getUserDetails(){
        return "User Details from Web Service";
    }
}
