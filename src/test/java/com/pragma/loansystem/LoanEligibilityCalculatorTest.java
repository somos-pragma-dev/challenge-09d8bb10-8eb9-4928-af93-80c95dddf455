package com.pragma.loansystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoanEligibilityCalculatorTest {
    @Test
    public void testCalculateEligibilityWithEligibleData() {
        LoanEligibilityCalculator loanEligibilityCalculator = new LoanEligibilityCalculator();
        LoanRequest loanRequest = new LoanRequest();
        // Configurar loanRequest con datos elegibles
        Assertions.assertTrue(loanEligibilityCalculator.calculateEligibility(loanRequest));
    }

    @Test
    public void testCalculateEligibilityWithIneligibleData() {
        LoanEligibilityCalculator loanEligibilityCalculator = new LoanEligibilityCalculator();
        LoanRequest loanRequest = new LoanRequest();
        // Configurar loanRequest con datos no elegibles
        Assertions.assertFalse(loanEligibilityCalculator.calculateEligibility(loanRequest));
    }

    @Test
    public void testCalculateEligibilityWithEmptyData() {
        LoanEligibilityCalculator loanEligibilityCalculator = new LoanEligibilityCalculator();
        LoanRequest loanRequest = new LoanRequest();
        // Configurar loanRequest con datos vacíos
        Assertions.assertFalse(loanEligibilityCalculator.calculateEligibility(loanRequest));
    }
}