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

    //Getter And Setter
    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getToken() {
        return Token;
    }

    public void setToken(String token) {
        Token = token;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
