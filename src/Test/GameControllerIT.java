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

import spil.GameController;

import static org.junit.Assert.*;

/**
 *
 * @author Injam DCF
 */
public class GameControllerIT {
    
    public GameControllerIT() {
    }

    /**
     * Test of playerTurn method, of class GameController.
     */
    @Test
    public void testPlayerTurn() {
        System.out.println("playerTurn");
        GameController instance = new GameController();
        instance.playerTurn();

    }

    /**
     * Test of playerTurn2 method, of class GameController.
     */
    @Test
    public void testPlayerTurn2() {
        System.out.println("playerTurn2");
        GameController instance = new GameController();
        instance.playerTurn2();

    }
    
}
