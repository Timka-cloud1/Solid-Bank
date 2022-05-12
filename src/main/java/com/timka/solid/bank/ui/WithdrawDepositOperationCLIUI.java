package com.timka.solid.bank.ui;

import org.springframework.stereotype.Component;

@Component
public interface WithdrawDepositOperationCLIUI{
    double requestClientAmount();
    String requestClientAccountNumber();
}
