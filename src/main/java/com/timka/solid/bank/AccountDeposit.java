package com.timka.solid.bank;

public class AccountDeposit extends Account{
    /**
     * можно только снимать.
     * @param accountType
     * @param id
     * @param clientID
     * @param balance
     * @param withdrawAllowed
     */
    public AccountDeposit(AccountType accountType, Long id, String clientID, double balance, boolean withdrawAllowed) {
        super(accountType, id, clientID, balance, withdrawAllowed);
    }
}
