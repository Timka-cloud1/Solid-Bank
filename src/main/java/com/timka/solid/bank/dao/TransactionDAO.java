package com.timka.solid.bank.dao;

import com.timka.solid.bank.transaction.Transaction;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionDAO {
    List<Transaction> getTransactions();
    void addTransaction(Transaction transaction);
}
