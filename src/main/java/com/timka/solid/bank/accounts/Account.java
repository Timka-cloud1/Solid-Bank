package com.timka.solid.bank.accounts;

public abstract class Account {

    private AccountType accountType;
    private Long id;
    private Long bankID;
    private String clientID;
    private double balance;
    private boolean withdrawAllowed;


    public Account(AccountType accountType, Long bankID, Long id, String clientID, double balance, boolean withdrawAllowed) {
        this.accountType = accountType;
        this.bankID = bankID;
        this.id = id;
        this.clientID = clientID;
        this.balance = balance;
        this.withdrawAllowed = withdrawAllowed;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setWithdrawAllowed(boolean withdrawAllowed) {
        this.withdrawAllowed = withdrawAllowed;
    }

    public boolean isWithdrawAllowed() {
        return withdrawAllowed;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getClientID() {
        return clientID;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return String.format("Account{type=%s,id='%03d%06d', clientID='%s', balance=0.0}", accountType, bankID, id, clientID);
    }
}
