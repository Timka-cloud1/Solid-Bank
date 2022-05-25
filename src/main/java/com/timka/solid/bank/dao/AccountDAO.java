package com.timka.solid.bank.dao;

import com.timka.solid.bank.accounts.Account;
import com.timka.solid.bank.accounts.AccountType;
import com.timka.solid.bank.accounts.AccountWithdraw;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDAO extends CrudRepository<Account, Long> {
    //@Query("SELECT * from Account a where a.client_id = :clientID")
    List<Account> findAccountsByClientID(String clientID);

    //  @Query("SELECT * from Account a where a.client_id = :clientID AND a.account_full_id = :accountID")
    Account findAccountByClientIDAndAccountFullId(String clientID, String accountID);
    @Modifying
    @Query("update Account a set a.account_full_id = :accountFullId where a.account_id = :accountID and a.client_id = :clientId")
    void setAccountFullId(String accountFullId, Long accountID, String clientId);


    @Query("SELECT account_id FROM Account a ORDER BY a.id DESC LIMIT 1;")
    Long getLastId();

    @Modifying
    @Query(
            "INSERT INTO Account (account_type, bank_id, client_id, balance, withdraw_allowed) values (:accountType, :bankId, :clientId, :balance, :withdrawAllowed)"
    )
    void createNewAccount(String accountType, Long bankId, String clientId, double balance, boolean withdrawAllowed);


    @Modifying
    @Query("update Account a set a.balance = :amount where a.account_full_id= :accountFullId")
    void updateAccount(String accountFullId, double amount);

    @Query("SELECT balance from Account a where a.account_full_id = :accountFullId")
    double getBalance(String accountFullId);

    @Query("select * from Account a where a.withdraw_allowed = 1 and a.client_id = :clientID and a.account_full_id = :accountID")
    AccountWithdraw getClientWithdrawAccount(String clientID, String accountID);


}
