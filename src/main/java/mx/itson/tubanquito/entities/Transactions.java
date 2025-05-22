/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.tubanquito.entities;

import java.util.Date;
import mx.itson.tubanquito.enums.TypeTransaction;

/**
 *
 * @author DanielMorales
 */
public class Transactions {

    //all transactions attributes were encapsulated
    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }
    
    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the reference
     */
    public String getReference() {
        return reference;
    }

    /**
     * @param reference the reference to set
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * @return the amount
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * @return the type
     */
    public TypeTransaction getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(TypeTransaction type) {
        this.type = type;
    }

    /*Date is an enum tipe for the variable date
    description is a string type used to describe the transaction
    reference is a string type used to reference the transaction
    amount is a double type used to store the amount of the transaction
    type is an enum type used to store the type of transaction
    */
    private Date date;
    private String description;
    private String reference;
    private Double amount;
    private TypeTransaction type;
    
    }

