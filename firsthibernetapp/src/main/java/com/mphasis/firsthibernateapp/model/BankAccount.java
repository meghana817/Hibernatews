package com.mphasis.firsthibernateapp.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
public class BankAccount {

    @Id
    private String accountNumber;

    private String accountHolderName;

    @Column(precision = 19, scale = 4)
    private BigDecimal balance;

    @Embedded
    private Currency currency;

    public BankAccount() {}

    public BankAccount(String accountNumber, String accountHolderName, BigDecimal balance, Currency currency) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.currency = currency;
    }

    // Getters and Setters
    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public String getAccountHolderName() { return accountHolderName; }
    public void setAccountHolderName(String accountHolderName) { this.accountHolderName = accountHolderName; }

    public BigDecimal getBalance() { return balance; }
    public void setBalance(BigDecimal balance) { this.balance = balance; }

    public Currency getCurrency() { return currency; }
    public void setCurrency(Currency currency) { this.currency = currency; }
}
