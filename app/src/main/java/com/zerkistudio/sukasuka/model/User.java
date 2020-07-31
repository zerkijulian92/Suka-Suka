package com.zerkistudio.sukasuka.model;

public class User {
    private int UserId;
    private String Username;
    private String Token;
    private String Password;

    //Constructor
    public User(int userId, String username, String password) {
        UserId = userId;
        Username = username;
        Password = password;
    }
}
