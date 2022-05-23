package com.timka.solid.bank.accounts;

public class SavingAccount extends AccountWithdraw{


    public SavingAccount(String accountFullId, String accountType, Long bankID, String clientID, double balance, boolean withdrawAllowed) {
        super(accountFullId, accountType, bankID, clientID, balance, withdrawAllowed);
    }
}
