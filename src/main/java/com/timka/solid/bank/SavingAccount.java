package com.timka.solid.bank;

public class SavingAccount extends AccountWithdraw{
    public SavingAccount(AccountType accountType, Long id, String clientID, double balance, boolean withdrawAllowed) {
        super(accountType, id, clientID, balance, withdrawAllowed);
    }
}
