package com.timka.solid.bank.accounts;

public class AccountDeposit extends Account{
    public AccountDeposit(AccountType accountType, Long bankID, Long id, String clientID, double balance, boolean withdrawAllowed) {
        super(accountType, bankID, id, clientID, balance, withdrawAllowed);
    }
    /**
     * можно только снимать.
     * @param accountType
     * @param id
     * @param clientID
     * @param balance
     * @param withdrawAllowed
     */

}
