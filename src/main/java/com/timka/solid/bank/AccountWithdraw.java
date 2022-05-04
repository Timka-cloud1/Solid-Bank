package com.timka.solid.bank;

public class AccountWithdraw extends Account{
    /**
     * можно снимать и вносить деньги.
     * @param accountType
     * @param id
     * @param clientID
     * @param balance
     * @param withdrawAllowed
     */
    public AccountWithdraw(AccountType accountType, Long id, String clientID, double balance, boolean withdrawAllowed) {
        super(accountType, id, clientID, balance, withdrawAllowed);
    }
}
