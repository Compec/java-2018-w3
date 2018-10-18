package com.company;

public class BankAccount {
    // Name of the bank account holder
    private String holderName;
    // Amount in the bank account
    private int amount;

    // Constructor of objects of class BankAccount
    // This constructor will be called when the object is to be created
    // It allows us to give it inital properties
    // So all BankAccounts now will have a holder whose name is `no one`
    // and a initial amount in the bank account of `100USD`
    BankAccount() {
        holderName = "no one";
        amount = 100;
    }

    // Getter method, allowing us only to read the value of holderName of this object
    // In other words, it is returning a copy of the value of holderName of this object
    public String getHolderName() {
        return holderName;
    }

    // Setter method, allowing us to change the value of holderName of this object by passing a newHolderName
    public void setHolderName(String newHolderName) {
        holderName = newHolderName;
    }

    // Method to receive a sum of money into the bank account
    public void getPaid(int incomingMoney) {
        amount += incomingMoney;
    }


    // Method which allows the user to pay some amount of money
    // Here we control whether to user has sufficient funds to complete the transaction
    public void pay(int payAmount) {
        if(amount >= payAmount) {
            amount -= payAmount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    // Getter method for amount
    public int getAmount() {
        return amount;
    }

    // Display the current balance
    public void displayBalance() {
        System.out.println(holderName + " has " + amount + " USD in bank!");
    }
}
