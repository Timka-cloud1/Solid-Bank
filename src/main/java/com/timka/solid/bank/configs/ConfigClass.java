package com.timka.solid.bank.configs;

import com.timka.solid.bank.AccountBasicCLI;
import com.timka.solid.bank.BankCore;
import com.timka.solid.bank.CLIUI;
import com.timka.solid.bank.MyCLI;
import com.timka.solid.bank.creationAccountService.AccountCreationService;
import com.timka.solid.bank.creationAccountService.AccountCreationServiceImpl;
import com.timka.solid.bank.creationAccountService.CreateAccountOperationUI;
import com.timka.solid.bank.dao.AccountDAO;
import com.timka.solid.bank.dao.MemoryAccountDAO;
import com.timka.solid.bank.listingAccountService.AccountListingService;
import com.timka.solid.bank.listingAccountService.AccountListingServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
@ComponentScan("com.timka.solid.bank")
public class ConfigClass {
//
//    @Bean
//    public MemoryAccountDAO memoryAccountDAO() {
//        return new MemoryAccountDAO();
//    }
//
//    @Bean
//    public AccountDAO accountDAO() {
//        return new MemoryAccountDAO();
//    }
//
//    @Bean
//    public AccountListingService accountListingService(MemoryAccountDAO memoryAccountDAO) {
//        return new AccountListingServiceImpl(memoryAccountDAO);
//    }
//
//    @Bean
//    public AccountListingServiceImpl accountListingServiceImpl(MemoryAccountDAO memoryAccountDAO) {
//        return new AccountListingServiceImpl(memoryAccountDAO);
//    }
//
//    @Bean
//    public AccountCreationService accountCreationService(MemoryAccountDAO memoryAccountDAO) {
//        return new AccountCreationServiceImpl(memoryAccountDAO);
//    }
//
//    @Bean
//    public AccountCreationServiceImpl accountCreationServiceImpl(MemoryAccountDAO memoryAccountDAO) {
//        return new AccountCreationServiceImpl(memoryAccountDAO);
//    }
//
//
//    @Bean
//    public BankCore bankCore(AccountCreationService accountCreationService) {
//        return new BankCore(accountCreationService);
//    }
//
    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }
//
//    @Bean
//    public CreateAccountOperationUI createAccountOperationUI(Scanner scanner) {
//        return new MyCLI(scanner);
//    }
//
//    @Bean
//    public CLIUI cliui(Scanner scanner) {
//        return new MyCLI(scanner);
//    }
//
//    @Bean
//    public MyCLI myCLI(Scanner scanner) {
//        return new MyCLI(scanner);
//    }
//
//    @Bean
//    public AccountBasicCLI accountBasicCLI(CreateAccountOperationUI createAccountOperationUI, BankCore bankCore, AccountListingService accountListingService) {
//        return new AccountBasicCLI(createAccountOperationUI, bankCore, accountListingService);
//    }
//
//
//
//
//
}