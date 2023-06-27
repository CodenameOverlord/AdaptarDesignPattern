package org.example.Adaptar;

import org.example.BankApis.PNBApi;

public class PNBBankAdaptar implements BankApi{
    @Override
    public double checkBalance(String acNo, String password) {
        return new PNBApi().checkCurrentBalancePnb(password,acNo)
    }

    @Override
    public boolean addAccount(String acNo) {
        return new PNBApi().accountAddPnb(acNo);
    }

    @Override
    public void sendMoney(String acFrom, String acTo, double amount) {
        new PNBApi().sendMoneyToAccountPnb(acFrom,acTo,amount);
    }
}
