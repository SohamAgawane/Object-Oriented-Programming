package com.soham.abstraction9;

class ATM {
    private double balance = 5000;

    public void withdraw(double amount, int pin) {
        if (validatePin(pin) && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Transaction failed");
        }
    }

    private boolean validatePin(int pin) {
        return pin == 1234;
    }
}

public class Main {
}
