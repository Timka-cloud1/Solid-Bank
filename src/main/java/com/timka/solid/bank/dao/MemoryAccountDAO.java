//package com.timka.solid.bank.dao;
//
//import com.timka.solid.bank.accounts.Account;
//import com.timka.solid.bank.accounts.AccountType;
//import com.timka.solid.bank.accounts.AccountWithdraw;
//import org.springframework.stereotype.Repository;
//
//import javax.annotation.PostConstruct;
//import java.util.ArrayList;
//import java.util.List;
//
//@Repository
//public class MemoryAccountDAO implements AccountDAO{
//    private List<Account> accountList;
//
//    @PostConstruct
//    private void init() {
//        accountList = new ArrayList<>();
//    }
//
//    @Override
//    public List<Account> getClientAccounts(String clientID) {
//        return accountList;
//    }
//
//    @Override
//    public void createNewAccount(Account account) {
//        accountList.add(account);
//        System.out.println("Bank account created");
//    }
//
//    @Override
//    public void updateAccount(Account account, double amount) {
//        account.setBalance(account.getBalance() + amount);
//
//    }
//
//    @Override
//    public List<Account> getClientAccountsByType(String clientID, AccountType accountType) {
//        throw new UnsupportedOperationException();
//    }
//
//    // отдает аккаунт для снятие денег
//    @Override
//    public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID) {
//        for(Account acc : accountList) {
//            if(acc.getClientID().equals(clientID) && acc.getAccountID().equals(accountID)) {
//                if(acc.isWithdrawAllowed()) {
//                    return (AccountWithdraw) acc;
//                } else {
//                    System.out.println("you cannot withdraw money from a fixed account");
//                    return null;
//                }
//            }
//
//        }
//        System.out.println("account number not found!");
//        return null;
//    }
//
//    // отдает аккаунт для пополнение
//    @Override
//    public Account getClientAccount(String clientID, String accountID) {
//        for(Account acc : accountList) {
//            if(acc.getClientID().equals(clientID) && acc.getAccountID().equals(accountID)) {
//                return acc;
//            }
//        }
//        return null;
//    }
//}
