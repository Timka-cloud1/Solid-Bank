package com.timka.solid.bank;

import org.springframework.stereotype.Component;

@Component
public interface WithdrawDepositOperationCLIUI{
    double requestClientAmount();
    String requestClientAccountNumber();
}
