package com.timka.solid.bank;

public class AccountWithdraw extends Account{
    public AccountWithdraw(AccountType accountType, Long bankID, Long id, String clientID, double balance, boolean withdrawAllowed) {
        super(accountType, bankID, id, clientID, balance, withdrawAllowed);
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
