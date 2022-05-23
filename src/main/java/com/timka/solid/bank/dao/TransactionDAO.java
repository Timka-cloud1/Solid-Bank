package com.timka.solid.bank.dao;

import com.timka.solid.bank.transaction.Transaction;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionDAO extends CrudRepository<Transaction, Long> {
    @Modifying
    @Query(
            "INSERT INTO Transaction (date, account_number, amount, type_of_operation) values (:date, :accountNumber, :amount, :type)"
    )
    void addTransaction(String date, String type, String accountNumber, double amount);
}
