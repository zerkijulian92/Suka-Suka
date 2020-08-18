package com.zerkistudio.sukasuka.model;

public class User {
    private int Id;
    private int IdPel;
    private String Nama;
    private String Email;
    private String Password;

    //Constructor
    public User(int id, int idPel, String nama, String password) {
        Id = id;
        IdPel = idPel;
        Nama = nama;
        Password = password;
    }

    //Getter And Setter
    public int getId() {
        return Id;
    }

    public int getIdPel() {
        return IdPel;
    }

    public void setIdPel(int idPel) {
        IdPel = idPel;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
