package com.timka.solid.bank.accounts;

public class SavingAccount extends AccountWithdraw{


    public SavingAccount(String accountType, Long bankID, String clientID, double balance, boolean withdrawAllowed) {
        super(accountType, bankID, clientID, balance, withdrawAllowed);
    }
}
