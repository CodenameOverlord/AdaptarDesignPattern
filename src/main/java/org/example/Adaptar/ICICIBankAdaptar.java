package org.example.Adaptar;

import org.example.BankApis.IciciApi;
import org.example.BankApis.YesBankApi;

public class ICICIBankAdaptar implements BankApi{
    @Override
    public double checkBalance(String acNo, String password) {
        return new IciciApi().checkCurrentBalanceICICI(password, acNo);
    }

    @Override
    public boolean addAccount(String acNo) {
        return new IciciApi().accountAddICICI(acNo);
    }

    @Override
    public void sendMoney(String acFrom, String acTo, double amount) {
        new IciciApi().sendMoneyToAccountICICI(acFrom,acTo, amount);
    }
}
