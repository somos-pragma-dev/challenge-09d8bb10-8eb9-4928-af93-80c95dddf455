package com.pragma.bank;

import org.springframework.stereotype.Service;

@Service
public class BankAccountService {
    private final BankAccountRepository bankAccountRepository;
    private final IdentityValidationService identityValidationService;

    public BankAccountService(BankAccountRepository bankAccountRepository, IdentityValidationService identityValidationService) {
        this.bankAccountRepository = bankAccountRepository;
        this.identityValidationService = identityValidationService;
    }

    public void openAccount(String accountNumber, String ownerIdentity) {
        // Implementar la lógica para abrir una cuenta
    }

    public void closeAccount(String accountNumber) {
        // Implementar la lógica para cerrar una cuenta
    }

    public String getAccountDetails(String accountNumber) {
        // Implementar la lógica para obtener los detalles de una cuenta
        return "";
    }
}