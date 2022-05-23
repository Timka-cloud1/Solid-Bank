package com.timka.solid.bank.accounts;

public class AccountWithdraw extends Account{
    public AccountWithdraw(String accountFullId, String accountType, Long bankID, String clientID, double balance, boolean withdrawAllowed) {
        super(accountFullId, accountType, bankID, clientID, balance, withdrawAllowed);
    }


    /**
     * можно снимать и вносить деньги.
     * @param accountType
     * @param id
     * @param clientID
     * @param balance
     * @param withdrawAllowed
     */

}
