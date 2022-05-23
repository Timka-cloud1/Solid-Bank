package com.timka.solid.bank.accounts;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;


@Data
@Builder
@AllArgsConstructor
public class Account {
    @Id
    //@Column("account_full_id")
    private String accountFullId;
   // @Column("account_type")
    private String accountType;
   // @Column("bank_id")
    private Long bankID;
   // @Column("client_id")
    private String clientID;
    //@Column("balance")
    private double balance;
    //@Column("withdraw_allowed")
    private boolean withdrawAllowed;

//    public Account(String accountType, Long bankID, String clientID, String accountFullId, double balance, boolean withdrawAllowed) {
//        this.accountType = accountType;
//        this.bankID = bankID;
//        this.clientID = clientID;
//        this.accountFullId = accountFullId;
//        this.balance = balance;
//        this.withdrawAllowed = withdrawAllowed;
//    }

    @Override
    public String toString() {
        return String.format("Account{type=%s,id='%s', clientID='%s', balance=%.2f}", accountType, accountFullId, clientID, balance);
    }
}
