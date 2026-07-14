package com.pragma.loansystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoanRegistryTest {
    @Test
    public void testRegisterLoan() {
        LoanRegistry loanRegistry = new LoanRegistry();
        LoanRequest loanRequest = new LoanRequest();
        // Configurar loanRequest con datos válidos
        loanRegistry.registerLoan(loanRequest);
        // Agregar asserts para verificar el comportamiento esperado
    }

    @Test
    public void testRegisterLoanWithDuplicateData() {
        LoanRegistry loanRegistry = new LoanRegistry();
        LoanRequest loanRequest = new LoanRequest();
        // Configurar loanRequest con datos duplicados
        loanRegistry.registerLoan(loanRequest);
        Assertions.assertThrows(IllegalStateException.class, () -> loanRegistry.registerLoan(loanRequest));
    }

    @Test
    public void testRegisterLoanWithEmptyData() {
        LoanRegistry loanRegistry = new LoanRegistry();
        LoanRequest loanRequest = new LoanRequest();
        // Configurar loanRequest con datos vacíos
        Assertions.assertThrows(IllegalArgumentException.class, () -> loanRegistry.registerLoan(loanRequest));
    }
}