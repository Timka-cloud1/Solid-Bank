package com.timka.solid.bank;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
@ComponentScan("com.timka.solid.bank")
public class ConfigClass {

    @Bean
    public MemoryAccountDAO memoryAccountDAO() {
        return new MemoryAccountDAO();
    }

    @Bean
    public AccountDAO accountDAO() {
        return new MemoryAccountDAO();
    }

    @Bean
    public AccountListingService accountListingService(MemoryAccountDAO memoryAccountDAO) {
        return new AccountListingServiceImpl(memoryAccountDAO);
    }

    @Bean
    public AccountListingServiceImpl accountListingServiceImpl(MemoryAccountDAO memoryAccountDAO) {
        return new AccountListingServiceImpl(memoryAccountDAO);
    }

    @Bean
    public AccountCreationService accountCreationService(MemoryAccountDAO memoryAccountDAO) {
        return new AccountCreationServiceImpl(memoryAccountDAO);
    }

    @Bean
    public AccountCreationServiceImpl accountCreationServiceImpl(MemoryAccountDAO memoryAccountDAO) {
        return new AccountCreationServiceImpl(memoryAccountDAO);
    }


    @Bean
    public BankCore bankCore(AccountCreationService accountCreationService) {
        return new BankCore(accountCreationService);
    }

    @Bean
    public Scanner scan() {
        return new Scanner(System.in);
    }

    @Bean
    public CreateAccountOperationUI createAccountOperationUI(Scanner scanner) {
        return new MyCLI(scanner);
    }

//    @Bean
//    public CLIUI cliui(Scanner scanner) {
//        return new MyCLI(scanner);
//    }
//
//    @Bean
//    public MyCLI myCLI(Scanner scanner) {
//        return new MyCLI(scanner);
//    }

    @Bean
    public AccountBasicCLI accountBasicCLI(CreateAccountOperationUI createAccountOperationUI, BankCore bankCore, AccountListingService accountListingService) {
        return new AccountBasicCLI(createAccountOperationUI, bankCore, accountListingService);
    }





}
