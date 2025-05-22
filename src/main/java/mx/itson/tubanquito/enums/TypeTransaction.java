/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package mx.itson.tubanquito.enums;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author rosagabriela
 */

 // enum for the type of transaction
public enum TypeTransaction {
    @SerializedName("1")
            DEBIT,
    @SerializedName("2")
            CREDIT
            
            
}
