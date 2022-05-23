package com.timka.solid.bank.services;

import com.timka.solid.bank.accounts.AccountWithdraw;
import org.springframework.stereotype.Service;

@Service
// снимать деньги
public interface AccountWithdrawService {
    boolean withdraw(double amount, AccountWithdraw account);
}
