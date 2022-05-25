package com.timka.solid.bank.accounts;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


public class AccountDeposit extends Account{
    public AccountDeposit(String accountType, Long bankID, String clientID, double balance, boolean withdrawAllowed) {
        super(accountType, bankID, clientID, balance, withdrawAllowed);
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
