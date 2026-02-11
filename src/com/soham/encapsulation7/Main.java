package com.soham.encapsulation7;

class User {
    private String username;
    private String password;

    // Setter for username
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter for username
    public String getUsername() {
        return username;
    }

    // Setter for password
    public void setPassword(String password) {
        if (password.length() >= 8) {
            this.password = password;
        } else {
            System.out.println("Password must be at least 8 characters long.");
        }
    }

    // Method to validate login
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}

public class Main {
    public static void main(String[] args) {

    }
}