package com.timka.solid.bank.listingAcc;

import com.timka.solid.bank.inmemory.AccountDAO;
import com.timka.solid.bank.accounts.Account;
import com.timka.solid.bank.accounts.AccountType;
import com.timka.solid.bank.accounts.AccountWithdraw;

import java.util.List;

//@Component
public class AccountListingServiceImpl implements AccountListingService{
    private AccountDAO accountDAO;

    // @Autowired
    public AccountListingServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public Account getClientAccount(String clientID, String accountID) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Account> getClientAccounts(String clientID) {
        return accountDAO.getClientAccounts(clientID);
    }

    @Override
    public List<Account> getClientAccountsByType(String clientID, AccountType accountType) {
        throw new UnsupportedOperationException();
    }
}
