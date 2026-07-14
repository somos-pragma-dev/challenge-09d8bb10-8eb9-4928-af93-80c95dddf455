package com.pragma.loansystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoanValidatorTest {
    @Test
    public void testValidateWithValidData() {
        LoanValidator loanValidator = new LoanValidator();
        LoanRequest loanRequest = new LoanRequest();
        // Configurar loanRequest con datos válidos
        loanValidator.validate(loanRequest);
        // Agregar asserts para verificar el comportamiento esperado
    }

    @Test
    public void testValidateWithInvalidData() {
        LoanValidator loanValidator = new LoanValidator();
        LoanRequest loanRequest = new LoanRequest();
        // Configurar loanRequest con datos inválidos
        Assertions.assertThrows(IllegalArgumentException.class, () -> loanValidator.validate(loanRequest));
    }

    @Test
    public void testValidateWithEmptyData() {
        LoanValidator loanValidator = new LoanValidator();
        LoanRequest loanRequest = new LoanRequest();
        // Configurar loanRequest con datos vacíos
        Assertions.assertThrows(IllegalArgumentException.class, () -> loanValidator.validate(loanRequest));
    }
}