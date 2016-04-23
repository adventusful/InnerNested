package com.company;

/**
 * Created by Daniil Kornienko on 23.04.2016.
 */
public class Bank {

    String name;

    public Bank(String name) {
        this.name = name;
    }

    public class Account {
        int accId;
        int balance;

        public Account(int accId, int balance) {
            this.accId = accId;
            this.balance = balance;
        }

        void showBalance() {
            System.out.println("Your balance: " + balance + " Your account is " + accId + "  " + name);
        }

        void putMoney(int a) {
            balance += a;
            showBalance();

        }

        void takemoney(int b) {

            if (b > balance) {
                System.out.println("Your balance is less than requested money");
                showBalance();

            } else {
                balance -= b;
                showBalance();
            }

        }
    }
}
