package com.timka.solid.bank;

public class FixedAccount extends AccountDeposit{
    public FixedAccount(AccountType accountType, Long id, String clientID, double balance, boolean withdrawAllowed) {
        super(accountType, id, clientID, balance, withdrawAllowed);
    }
}
