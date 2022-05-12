package com.timka.solid.bank.transaction;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
@Data
public class Transaction {
    private long id;
    private String date;
    private String accountNumber;
    private double amount;
    private String typeOfOperation;

    public Transaction(String date, String typeOfOperation, String accountNumber, double amount) {
        this.date = date;
        this.typeOfOperation = typeOfOperation;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("Transaction[id = %d, %s account = %s, amount = %.2f, date = %s",id, typeOfOperation,accountNumber, amount, date);
    }
}
