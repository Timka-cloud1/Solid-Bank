package com.timka.solid.bank;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class MemoryTransactionDAO implements TransactionDAO{
    private List<Transaction> transactions;

    @PostConstruct
    public void init() {
        transactions = new ArrayList<>();
    }

    @Override
    public List<Transaction> getTransactions() {
        return null;
    }

    @Override
    public void addTransaction(Transaction transaction) {

    }
}
