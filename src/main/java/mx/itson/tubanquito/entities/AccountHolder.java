/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.tubanquito.entities;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author DanielMorales
 */
public class AccountHolder {

    private int code;
    private String name;
    private String address;
    private String city;
    @SerializedName("taxpayer-id")
    private String taxpayerId;
    @SerializedName("zip-code")
    private int zipCode;   
    
}
