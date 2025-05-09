/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.tubanquito.entities;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author rosagabriela
 */
public class AccountHolder {
    public String name;
    public String adress;
    public String city;
    @SerializedName("taxpayer-id")
    public String taxPayed;
    @SerializedName("zip-code")
    public int zipCode;
    //555
    
}
