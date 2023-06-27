package org.example.Adaptar;

import org.example.BankApis.YesBankApi;

public class YesBankAdaptar implements BankApi{
    @Override
    public double checkBalance(String acNo, String password) {
        return new YesBankApi().checkCurrentBalanceYESBANK(password, acNo);
    }

    @Override
    public boolean addAccount(String acNo) {
        return new YesBankApi().accountAddYESBANK(acNo);
    }

    @Override
    public void sendMoney(String acFrom, String acTo, double amount) {
        new YesBankApi().sendMoneyToAccountYESBANK(acFrom, acTo, amount);
    }
}
