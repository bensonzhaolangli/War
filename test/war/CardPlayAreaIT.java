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
     * Test of getLastFlippedCard method, of class CardPlayArea. Ensure that the
     * method is able to return the most recent card a player flipped
     */
    @Test
    public void testGetLastFlippedCardGood() {
        System.out.println("getLastFlippedCard Good");

        //Create a player with 1 cards in hand
        Player testPlayer = new Player();
        Card testCard = new Card(Card.Rank.ACE, Card.Suit.CLUBS);
        testPlayer.getHand().addCardToTop(testCard);
        //Player plays his card face-side up
        testPlayer.playCard();

        //The last flipped card should be the card the player just played
        Card result = testPlayer.getPlayArea().getLastFlippedCard();

        assertEquals(testCard, result);
    }

    /**
     * Test of getLastFlippedCard method, of class CardPlayArea. Ensure that the
     * method will return null if there were are flipped cards in the play area.
     */
    @Test
    public void testGetLastFlippedCardBad() {
        System.out.println("getLastFlippedCard Bad");

        //Create a player with 1 cards in hand
        Player testPlayer = new Player();

        //The last flipped card should be the card the player just played
        Card result = testPlayer.getPlayArea().getLastFlippedCard();

        assertEquals(null, result);
    }

    /**
     * Test of getLastFlippedCard method, of class CardPlayArea. Ensure that the
     * method will return the last flipped card, even when there are multiple
     * flipped cards existing in the player's play area.
     */
    @Test
    public void testGetLastFlippedCardBoundary() {
        System.out.println("getLastFlippedCard Good");

        //Create a player with 2 cards in hand
        Player testPlayer = new Player();
        Card testCard = new Card(Card.Rank.ACE, Card.Suit.CLUBS);

        testPlayer.getHand().addCardToTop(testCard);
        testPlayer.getHand().addCardToTop(new Card(Card.Rank.SIX, Card.Suit.CLUBS));
        testPlayer.getHand().addCardToTop(new Card(Card.Rank.SIX, Card.Suit.CLUBS));

        //Player plays all his cards face-up, he will play the test card the last
        while (!testPlayer.getHand().isEmpty()) {
            testPlayer.playCard();
        }

        //The last flipped card should be the card the player plays the last
        Card result = testPlayer.getPlayArea().getLastFlippedCard();

        assertEquals(testCard, result);
    }
}
