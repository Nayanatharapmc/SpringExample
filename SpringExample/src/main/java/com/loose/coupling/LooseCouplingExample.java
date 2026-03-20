package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args){
        // This is not inversion of control. We are creating and managing objects in the source code itself. But in Spring it creates and manages the objects so we need to create it in the source code
        UserDataProvider databaseProvider = new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager(databaseProvider);
        System.out.println(userManagerWithDB.getUserInfo());

        UserDataProvider webserviceProvider = new WebServieDataProvider();
        UserManager userManagerWithWeb = new UserManager(webserviceProvider);
        System.out.println(userManagerWithWeb.getUserInfo());

        UserDataProvider newDBProvider = new NewDBProvider();
        UserManager userManagerWithNewDB = new UserManager(newDBProvider);
        System.out.println(userManagerWithNewDB.getUserInfo());
    }
}
