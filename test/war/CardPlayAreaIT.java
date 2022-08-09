/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package war;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author benso
 */
public class CardPlayAreaIT {
    
    public CardPlayAreaIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFlippedCards method, of class CardPlayArea.
     */
    @Test
    public void testGetFlippedCards() {
        System.out.println("getFlippedCards");
        CardPlayArea instance = new CardPlayArea();
        ArrayList<Card> expResult = null;
        ArrayList<Card> result = instance.getFlippedCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastFlippedCard method, of class CardPlayArea.
     */
    @Test
    public void testGetLastFlippedCard() {
        System.out.println("getLastFlippedCard");
        CardPlayArea instance = new CardPlayArea();
        Card expResult = null;
        Card result = instance.getLastFlippedCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of flipCard method, of class CardPlayArea.
     */
    @Test
    public void testFlipCard() {
        System.out.println("flipCard");
        Card card = null;
        CardPlayArea instance = new CardPlayArea();
        instance.flipCard(card);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clearFlippedCards method, of class CardPlayArea.
     */
    @Test
    public void testClearFlippedCards() {
        System.out.println("clearFlippedCards");
        CardPlayArea instance = new CardPlayArea();
        instance.clearFlippedCards();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class CardPlayArea.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        CardPlayArea instance = new CardPlayArea();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
