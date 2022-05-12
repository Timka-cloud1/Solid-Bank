package com.timka.solid.bank;

import com.timka.solid.bank.creationAccountService.CreateAccountOperationUI;
import org.springframework.stereotype.Component;

@Component
public interface CLIUI extends CreateAccountOperationUI, WithdrawDepositOperationCLIUI {
}
