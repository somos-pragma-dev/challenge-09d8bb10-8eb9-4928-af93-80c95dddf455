package com.pragma.loansystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoanApplicationTest {
    @Test
    public void testApplyLoan() {
        LoanApplication loanApplication = new LoanApplication(new LoanValidator(), new LoanEligibilityCalculator(), new LoanRegistry());
        LoanRequest loanRequest = new LoanRequest();
        loanApplication.applyLoan(loanRequest);
        // Agregar asserts para verificar el comportamiento esperado
    }

    @Test
    public void testApplyLoanWithInvalidData() {
        LoanApplication loanApplication = new LoanApplication(new LoanValidator(), new LoanEligibilityCalculator(), new LoanRegistry());
        LoanRequest loanRequest = new LoanRequest();
        // Configurar loanRequest con datos inválidos
        loanApplication.applyLoan(loanRequest);
        // Agregar asserts para verificar el comportamiento esperado
    }

    @Test
    public void testApplyLoanWithEligibleData() {
        LoanApplication loanApplication = new LoanApplication(new LoanValidator(), new LoanEligibilityCalculator(), new LoanRegistry());
        LoanRequest loanRequest = new LoanRequest();
        // Configurar loanRequest con datos elegibles
        loanApplication.applyLoan(loanRequest);
        // Agregar asserts para verificar el comportamiento esperado
    }
}