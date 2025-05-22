/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.tubanquito.entities;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author miria
 */
public class AccountTest {
    
    public AccountTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    /**
     * Test of calculateBalanceWithDailyInterest method, of class Account.
     */
    @Test
    public void testCalculateBalanceWithDailyInterest() {
        System.out.println("calculateBalanceWithDailyInterest");
        double currentBalance = 63401.0;
        double dailyInterestRate = 0.005;
        int numberOfDays = 15;
        Account instance = new Account();
        double expResult = 0.0;
        double result = instance.calculateBalanceWithDailyInterest(currentBalance, dailyInterestRate, numberOfDays);
        assertEquals(expResult, result, 130843.97);
    }
    
}
