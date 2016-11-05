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
import spil.Player;

import static org.junit.Assert.*;

/**
 *
 * @author Injam DCF
 */
public class PlayerIT {
    
    public PlayerIT() {
    }

    /**
     * Test of getPlayerName method, of class Player.
     */
    @Test
    public void testGetPlayerName() {
        System.out.println("getPlayerName");
        String PlayerName = null;
        Player instance = new Player();
        String expResult = null;
        String result = instance.getPlayerName(PlayerName);
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class Player.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Player instance = new Player();
        String expResult = null;
        String result = instance.toString();
        assertEquals(expResult, result);

    }

    /**
     * Test of getBank method, of class Player.
     */
    @Test
    public void testGetBank() {
        System.out.println("getBank");
        Player instance = new Player();
        Bank expResult = instance.getBank();
        Bank result = instance.getBank();
        assertEquals(expResult, result);
 
    }
    
}
