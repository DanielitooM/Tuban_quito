/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.tubanquito.entities;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 *
 * @author DanielMorales
 */
public class Account {

    //all account attributes were encapsulated
    /**
     * @return the product
     */
    public String getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * @return the accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * @param currency the currency to set
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * @return the accountHolder
     */
    public AccountHolder getAccountHolder() {
        return accountHolder;
    }

    /**
     * @param accountHolder the accountHolder to set
     */
    public void setAccountHolder(AccountHolder accountHolder) {
        this.accountHolder = accountHolder;
    }

    /**
     * @return the transactions
     */
    public List <Transactions> getTransactions() {
        return transactions;
    }

    /**
     * @param transactions the transactions to set
     */
    public void setTransactions(List <Transactions> transactions) {
        this.transactions = transactions;
    }
    /*1.product is the name of the account
    2.accountNumber is the number of the account. its a serialized name from account-number
    3.currency is the currency of the account
    4.accountHolder is the owner of the account. it is a serialized name from account-holder
    5.transactions is the list of transactions of the account
    */
    private String product;
    @SerializedName("account-number")
    private String accountNumber;
    private String currency;
    @SerializedName("account-holder")
    private AccountHolder accountHolder;
    private List <Transactions> transactions;
    
    public static Account deserialize(String json) {
        Account account = null;
        try {
            Gson gson = new Gson();
            account = gson.fromJson(json, Account.class);
        } catch (Exception ex) {
            System.err.println("Error deserializing Account with default Gson: " + ex.getMessage());
            ex.printStackTrace();
        }
        return account;
    }

    public double calculateBalanceWithDailyInterest(double currentBalance, double dailyInterestRate, int numberOfDays) {
        if (currentBalance <= 0 || numberOfDays <= 0) {
            return currentBalance; // No calcular interés si no hay balance o días
        }

        // Interés = Balance * Tasa diaria * Número de días
        double interestForPeriod = currentBalance * dailyInterestRate * numberOfDays;
        
        return currentBalance + interestForPeriod;
        
    }
    
    }
