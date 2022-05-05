package com.rakh1m.rakh1m;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
@ComponentScan("com.rakh1m.rakh1m")
public class AppConfig {

    @Bean
    public MemoryAccountDao memoryAccountDao() {
        return new MemoryAccountDao();
    }
    @Bean
    public AccountDAO accountDAO() {
        return new MemoryAccountDao();
    }
    @Bean
    public AccountListingService accountListingService(MemoryAccountDao memoryAccountDao) {
        return new AccountListingServiceImpl(memoryAccountDao);
    }

    @Bean
    public AccountCreationService accountCreationService(MemoryAccountDao memoryAccountDao) {
        return new AccountCreationServiceImpl(memoryAccountDao);
    }
    @Bean
    public BankCore bankCore(AccountCreationService accountCreationService) {
        return new BankCore(accountCreationService);
    }
    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }
    @Bean
    public CreateAccountOperationUI createAccountOperationUI(Scanner scanner) {
        return new MyCLI(scanner);
    }
    @Bean
    public AccountBasicCLI accountBasicCLI(CreateAccountOperationUI createAccountOperationUI, BankCore bankCore, AccountListingService accountListingService) {
        return new AccountBasicCLI(createAccountOperationUI, bankCore, accountListingService);
    }




}
