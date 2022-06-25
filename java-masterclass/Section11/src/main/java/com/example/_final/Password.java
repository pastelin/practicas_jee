package com.example._final;

public class Password {

    private static final int key = 748576362;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecript(password);
    }

    private int encryptDecript(int password) {
        return password ^ key;
    }

    public void storePassword(String password) {
        System.out.println("Saving password as " + this.encryptedPassword);
    }

    public boolean letMeIn(int password) {
        if(encryptDecript(password) == this.encryptedPassword) {
            System.out.println("Welcome");
            return true;
        } else {
            System.out.println("Nope, you cannor come in");
            return false;
        }
    }
}
