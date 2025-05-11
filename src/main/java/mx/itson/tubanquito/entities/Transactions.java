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

    /**
     * @return the day
     */
    public Date getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(Date day) {
        this.day = day;
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
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
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
    
    private Date day;
    private String description;
    private String reference;
    private int amount;
    private TypeTransaction type;
}
