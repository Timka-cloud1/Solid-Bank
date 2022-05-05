package com.timka.solid.bank;

public class FixedAccount extends AccountDeposit{

    public FixedAccount(AccountType accountType, Long bankID, Long id, String clientID, double balance, boolean withdrawAllowed) {
        super(accountType, bankID, id, clientID, balance, withdrawAllowed);
    }
}
