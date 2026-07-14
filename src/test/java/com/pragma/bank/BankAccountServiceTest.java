package com.pragma.bank;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class BankAccountServiceTest {

    @Autowired
    private BankAccountService bankAccountService;

    @MockBean
    private BankAccountRepository bankAccountRepository;

    @MockBean
    private IdentityValidationService identityValidationService;

    @Test
    void openAccount_shouldCallRepository() {
        // Arrange
        String accountNumber = "123456";
        String ownerIdentity = "identity123";
        Mockito.doNothing().when(identityValidationService).validateIdentity(ownerIdentity);
        Mockito.doNothing().when(bankAccountRepository).openAccount(accountNumber, ownerIdentity);

        // Act
        bankAccountService.openAccount(accountNumber, ownerIdentity);

        // Assert
        Mockito.verify(bankAccountRepository).openAccount(accountNumber, ownerIdentity);
    }

    @Test
    void closeAccount_shouldCallRepository() {
        // Arrange
        String accountNumber = "123456";
        Mockito.doNothing().when(bankAccountRepository).closeAccount(accountNumber);

        // Act
        bankAccountService.closeAccount(accountNumber);

        // Assert
        Mockito.verify(bankAccountRepository).closeAccount(accountNumber);
    }

    @Test
    void getAccountDetails_shouldCallRepository() {
        // Arrange
        String accountNumber = "123456";
        String accountDetails = "Account Details";
        Mockito.when(bankAccountRepository.getAccountDetails(accountNumber)).thenReturn(accountDetails);

        // Act
        String result = bankAccountService.getAccountDetails(accountNumber);

        // Assert
        Mockito.verify(bankAccountRepository).getAccountDetails(accountNumber);
        org.junit.jupiter.api.Assertions.assertEquals(accountDetails, result);
    }
}