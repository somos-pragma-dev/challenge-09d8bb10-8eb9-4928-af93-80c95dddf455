package com.pragma.bank;

public interface BankAccountRepository {
    void openAccount(String accountNumber, String ownerIdentity);
    void closeAccount(String accountNumber);
    String getAccountDetails(String accountNumber);
}