package com.timka.solid.bank.dao;

import com.timka.solid.bank.transaction.Transaction;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class MemoryTransactionDAO implements TransactionDAO {
    private List<Transaction> transactions;
    private static long id;

    @PostConstruct
    public void init() {
        transactions = new ArrayList<>();
    }

    @Override
    public List<Transaction> getTransactions() {
        return transactions;
    }

    @Override
    public void addTransaction(Transaction transaction) {
        ++id;
        transaction.setId(id);
        transactions.add(transaction);
    }
}
