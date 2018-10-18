package com.company;

public class Main {

    public static void main(String[] args) {
        // Create a new object of type `Person` and call it personA
        Person personA = new Person();
        // Create a new object of type `Person` and call it personB
        Person personB = new Person();
        // These are now two `Person`s. They share the fact that they both
        // have a `firstName`, a `lastName` and an `age` property
        // but each object holds its own copy
        // This means that names or age of personA and personB can be different

        // Because `firstName` and `lastName` are both public fields,
        // we are able to read them and write to them whatever we want.
        personB.firstName = "John";
        personB.lastName = "Maverick";

        // If we had access to a person's age directly,
        // we would be able to set the age to whatever we want, even give it values
        // that "do not make sense", such as a negative age
        // but because we made age a private field,
        // setAge will be able to control the field.
        // In this case, it will choose whether to accept the new age
        // and maybe do some transformations, side effects etc..
        personB.setAge(-19);

        System.out.println(personA.getAge()); // 34 (default value in constructor)
        System.out.println(personB.getAge()); // 34 (age -19 not accepted by `setAge`)
        personA.printMyName(); // Mehdi Saffar (default value in constructor)
        personB.printMyName(); // John Maverick (changed in main method)

        BankAccount bankAccount = new BankAccount(); // Call the constructor of BankAccount
        bankAccount.setHolderName("Fatih Etyemez"); // Setting the holder name
        bankAccount.getPaid(200); // Receives a payment of 200USD
        bankAccount.pay(1000); // Tries to pay 1000 USD but only has 300 USD by now, therefore amount stays 300 USD
        bankAccount.displayBalance(); // Displays the balance of this bank account
    }
}
