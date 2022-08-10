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
public class PlayerIT {

    public PlayerIT() {
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
     * Test of playCard method, of class Player. Make sure that the card the
     * player plays is transferred to the top of his play area.
     */
    @Test
    public void testPlayCard() {
        System.out.println("Test playCard Good");

        Player testPlayer = new Player();
        testPlayer.getHand().addCardToTop(new Card(Card.Rank.ACE, Card.Suit.CLUBS));
        testPlayer.getHand().addCardToTop(new Card(Card.Rank.SIX, Card.Suit.CLUBS));

        Card result = testPlayer.playCard();
        Card expResult = testPlayer.getPlayArea().removeCardFromTop();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of playWarCards method, of class Player. Make sure that the cards
     * the player plays during war are transferred to his play area.
     */
    @Test
    public void testPlayWarCards() {
        System.out.println("Test playCard Good");

        Player testPlayer = new Player();
        testPlayer.getHand().addCardToTop(new Card(Card.Rank.ACE, Card.Suit.CLUBS));
        testPlayer.getHand().addCardToTop(new Card(Card.Rank.SIX, Card.Suit.CLUBS));
        testPlayer.getHand().addCardToTop(new Card(Card.Rank.ACE, Card.Suit.CLUBS));
        testPlayer.getHand().addCardToTop(new Card(Card.Rank.SIX, Card.Suit.CLUBS));

        ArrayList<Card> result = testPlayer.playWarCards();
        
        ArrayList<Card> expResult = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            expResult.add(testPlayer.getPlayArea().removeCardFromBottom());
        }

        assertEquals(expResult, result);
    }

}
