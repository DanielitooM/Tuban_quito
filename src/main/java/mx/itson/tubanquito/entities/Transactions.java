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
    
    private Date day;
    private String description;
    private String reference;
    private int amount;
    private TypeTransaction type;
}
