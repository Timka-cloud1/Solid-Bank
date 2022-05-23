package com.timka.solid.bank.accounts;

public class FixedAccount extends AccountDeposit{


    public FixedAccount(String accountFullId, String accountType, Long bankID, String clientID, double balance, boolean withdrawAllowed) {
        super(accountFullId, accountType, bankID, clientID, balance, withdrawAllowed);
    }
}
