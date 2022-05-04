package com.timka.solid.bank;

public class CheckingAccount extends AccountWithdraw{
    public CheckingAccount(AccountType accountType, Long id, String clientID, double balance, boolean withdrawAllowed) {
        super(accountType, id, clientID, balance, withdrawAllowed);
    }
}
