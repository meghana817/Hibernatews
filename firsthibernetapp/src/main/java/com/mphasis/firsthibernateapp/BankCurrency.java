package com.mphasis.firsthibernateapp;

import com.mphasis.firsthibernateapp.model.BankAccount;
import com.mphasis.firsthibernateapp.model.Currency;
import com.mphasis.firsthibernetapp.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.math.BigDecimal;

public class BankCurrency {
	public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        BankAccount acc1 = new BankAccount("ACC001", "Alice Smith",
                new BigDecimal("1500.00"), new Currency("USD", "$", "en-US"));

        BankAccount acc2 = new BankAccount("ACC002", "Bob Johnson",
                new BigDecimal("2500.50"), new Currency("EUR", "€", "de-DE"));

        session.persist(acc1);
        session.persist(acc2);

        BankAccount retrievedAcc1 = session.get(BankAccount.class, "ACC001");
        BankAccount retrievedAcc2 = session.get(BankAccount.class, "ACC002");

        System.out.println(retrievedAcc1.getAccountHolderName() + ": " +
                retrievedAcc1.getCurrency().getCurrencySymbol() + retrievedAcc1.getBalance());

        System.out.println(retrievedAcc2.getAccountHolderName() + ": " +
                retrievedAcc2.getCurrency().getCurrencySymbol() + retrievedAcc2.getBalance());

        tx.commit();
        session.close();
    }
}


