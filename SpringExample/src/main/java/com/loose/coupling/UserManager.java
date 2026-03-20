package com.loose.coupling;

public class UserManager {
    // This is a dependency. This class depends on the UserDataProvider interface
    private UserDataProvider userDataProvider;

    public UserManager(UserDataProvider userDataProvider){
        this.userDataProvider = userDataProvider;
    }

    public String getUserInfo(){
        return userDataProvider.getUserDetails();
    }
}
