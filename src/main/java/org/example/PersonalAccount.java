package org.example;

import java.util.ArrayList;

public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    ArrayList<Amount> transactions = new ArrayList<Amount>();

    public PersonalAccount(int accountNumber, String accountHolder){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }
    public void deposit(double amount){
        Amount a1 = new Amount(amount, "Deposit");
        transactions.add(a1);
        this.balance += amount;
    }
    public void withdraw(double amount) throws InsufficientBalanceException{
        if (this.balance > amount){
            Amount a2 = new Amount(amount, "Withdraw");
            transactions.add(a2);
            this.balance -= amount;
        } else {
            throw new InsufficientBalanceException("Soory, but you do not have enough money for that");
        }
    }
    public void printTransactionHistory(){
        for (int i=0; i<transactions.size(); i++){
            System.out.println(transactions.get(i).getAmount());
        }
    }
    public double getBalance(){
        return this.balance;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public String getAccountHolder(){
        return this.accountHolder;
    }

}
