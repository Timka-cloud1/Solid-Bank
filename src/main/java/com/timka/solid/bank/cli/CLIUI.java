package com.timka.solid.bank.cli;

import com.timka.solid.bank.ui.CreateAccountOperationUI;
import com.timka.solid.bank.ui.WithdrawDepositOperationCLIUI;
import org.springframework.stereotype.Component;

@Component
public interface CLIUI extends CreateAccountOperationUI, WithdrawDepositOperationCLIUI {
}
