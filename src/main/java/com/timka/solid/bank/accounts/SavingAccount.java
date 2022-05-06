package com.timka.solid.bank.accounts;

public class SavingAccount extends AccountWithdraw{

    public SavingAccount(AccountType accountType, Long bankID, Long id, String clientID, double balance, boolean withdrawAllowed) {
        super(accountType, bankID, id, clientID, balance, withdrawAllowed);
    }
}
