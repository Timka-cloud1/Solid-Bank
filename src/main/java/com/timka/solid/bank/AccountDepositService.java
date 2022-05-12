package com.timka.solid.bank;

import com.timka.solid.bank.accounts.Account;
import com.timka.solid.bank.accounts.AccountWithdraw;
import org.springframework.stereotype.Service;

@Service
//пополнять деньги
public interface AccountDepositService {
    public void deposit(double amount, Account account);
}
