package com.example.luclhph12819.model;

import java.util.PrimitiveIterator;

public class NguoiDung {
    private String username;
    private String password;
    private String Phone;
    private String Hoten;

    public NguoiDung() {
    }

    public NguoiDung(String username, String password, String phone, String hoten) {
        this.username = username;
        this.password = password;
        Phone = phone;
        Hoten = hoten;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    @Override
    public String toString() {
        return "NguoiDung{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Hoten='" + Hoten + '\'' +
                '}';
    }
}
