package org.example.Adaptar;

public interface BankApi {
    double checkBalance(String acNo, String password);
    boolean addAccount(String acNo);
    void sendMoney(String acFrom , String acTo, double amount);
}
