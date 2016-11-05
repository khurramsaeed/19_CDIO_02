/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import spil.Bank;

import static org.junit.Assert.*;

/**
 *
 * @author Injam DCF
 */
public class BankIT {
    
    public BankIT() {
    }
    
    /**
     * Test of toString method, of class Bank.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Bank instance = new Bank(1000);
        String expResult = "(1000)";
        String result = instance.toString();
        assertEquals(expResult, result);

    }

    /**
     * Test of addEffect method, of class Bank.
     */
    @Test
    public void testAddEffect() {
        System.out.println("addEffect");
        int x = 10;
        Bank instance = new Bank(0);
        instance.addEffect(x);

    }
    
}
