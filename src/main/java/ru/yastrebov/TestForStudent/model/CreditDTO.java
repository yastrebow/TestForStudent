package ru.yastrebov.TestForStudent.model;

import java.math.BigDecimal;
import java.util.List;

public class CreditDTO {

    private BigDecimal amount;
    private Integer term;
    BigDecimal monthlyPayment;
    BigDecimal rate;
    BigDecimal psk;
    Boolean isInsuranceEnabled;
    Boolean isSalaryClient;
}
