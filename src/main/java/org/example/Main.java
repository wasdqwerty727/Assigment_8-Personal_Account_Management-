package org.example;

public class Main {
    public static void main(String[] args) throws InsufficientBalanceException {
            PersonalAccount p = new PersonalAccount(12345, "Bob");

            System.out.println(p.getBalance());
            System.out.println(p.getAccountNumber());
            System.out.println(p.getAccountHolder());

            p.deposit(1000);
            System.out.println(p.getBalance());
            p.withdraw(1500);
            System.out.println(p.getBalance());

            p.printTransactionHistory();
        }
    }
