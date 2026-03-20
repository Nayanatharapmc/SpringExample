package com.loose.coupling;

public class NewDBProvider implements UserDataProvider{
    @Override
    public String getUserDetails(){
        return "User Details from New Database";
    }
}
