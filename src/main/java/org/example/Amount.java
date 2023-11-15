package org.example;

public class Amount {
    private double amount;
    private String transactionType;

    public Amount(double amount, String transactionType){
        this.amount = amount;
        this.transactionType = transactionType;
    }
    public String getAmount(){
        return this.transactionType + ": " + this.amount;
    }
}
