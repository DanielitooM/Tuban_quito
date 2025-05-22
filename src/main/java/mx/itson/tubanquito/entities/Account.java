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
    
    /**
     * 
     * @param json
     * @return deserealized object of type Account
     */
    /*1.this method deserializes a json string into an object of type Account
    2.it uses the Gson library to do so 
    3.it takes a json string as input and returns an object of type Account
    4.it uses a try-catch block to handle any exceptions that may occur during the deserialization process
    5.if an exception occurs, it prints the error message to the console
    */
    public  static Account deserialize(String json) {
        Account a = new Account ();
        try {
            Gson gson = new Gson();
            a = gson.fromJson(json, Account.class);
        }catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
        }return a; 
    }
    
}
