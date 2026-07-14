package com.pragma.loansystem;

import com.pragma.loansystem.LoanValidator;
import com.pragma.loansystem.LoanEligibilityCalculator;
import com.pragma.loansystem.LoanRegistry;

public class LoanApplication {
    private final LoanValidator loanValidator;
    private final LoanEligibilityCalculator loanEligibilityCalculator;
    private final LoanRegistry loanRegistry;

    public LoanApplication(LoanValidator loanValidator, LoanEligibilityCalculator loanEligibilityCalculator, LoanRegistry loanRegistry) {
        this.loanValidator = loanValidator;
        this.loanEligibilityCalculator = loanEligibilityCalculator;
        this.loanRegistry = loanRegistry;
    }

    public void applyLoan(LoanRequest loanRequest) {
        loanValidator.validate(loanRequest);
        boolean isEligible = loanEligibilityCalculator.calculateEligibility(loanRequest);
        if (isEligible) {
            loanRegistry.registerLoan(loanRequest);
        }
    }
}