package com.company;

import java.util.Random;

/**
 * Created by Daniil Kornienko on 23.04.2016.
 */
public class BankMain {
    public static void main(String[] args) {
        Random random = new Random();

        Bank privateB = new Bank("Private");
        Bank.Account m = privateB.new Account(random.nextInt(1000), 500  );
        m.showBalance();
        m.putMoney(50);
        m.takemoney(400);
        m.takemoney(50000);
    }



}
