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
public class GroupOfCardsIT {

    public GroupOfCardsIT() {
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
     * Test of size method, of class GroupOfCards. This method will ensure that
     * the size method returns the correct size. An input of a hand containing
     * 10 cards is 
     */
    @Test
    public void testSize() {
        System.out.println("Test Return Group of Cards Size");
        GroupOfCards instance = null;
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of isEmpty method, of class GroupOfCards.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        GroupOfCards instance = null;
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeCardFromTop method, of class GroupOfCards. This method
     * gives a good input of a hand with three cards. We will test to ensure,
     * that the card removed from the hand, will be the card that was at the top 
     * of the hand.
     */
    @Test
    public void testRemoveCardFromTopGood() {
        System.out.println("Test Remove Card From Top Good");

        //Create a hand composed of three cards. The top card in the hand
        //is a Jack of Diamonds
        Hand testHand = new Hand();
        testHand.addCardToTop(new Card(Card.Rank.ACE, Card.Suit.CLUBS));
        testHand.addCardToTop(new Card(Card.Rank.FOUR, Card.Suit.HEARTS));
        testHand.addCardToTop(new Card(Card.Rank.JACK, Card.Suit.DIAMONDS));

        //Call the removeCardFromTop() method on the group of cards
        Card result = testHand.removeCardFromTop();

        //Store the card returned from removeCardFromTop() in variable result
        Card expectedCardRemoved = new Card(Card.Rank.JACK, Card.Suit.DIAMONDS);
        //The card removed should be Jack of Diamonds, since it was the top
        //card in the hand
        assertEquals(expectedCardRemoved, result);
    }

    /**
     * Test of removeCardFromTop method, of class GroupOfCards. This test gives
     * a bad input of removing a card from an empty hand. This will ensure that
     * the Card object returned will be null
     */
    @Test
    public void testRemoveCardFromTopBad() {
        System.out.println("Test Remove Card From Top Bad");

        //Create an empty hand
        Hand testHand = new Hand();

        //Call the removeCardFromTop() method on the empty hand
        Card result = testHand.removeCardFromTop();

        //There should be null returned, since no Card object was removed
        assertEquals(null, result);
    }

    /**
     * Test of removeCardFromBottom method, of class GroupOfCards.
     */
    @Test
    public void testRemoveCardFromBottom() {
        System.out.println("removeCardFromBottom");
        GroupOfCards instance = null;
        Card expResult = null;
        Card result = instance.removeCardFromBottom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCardToTop method, of class GroupOfCards.
     */
//    @Test
//    public void testAddCardToTop() {
//        System.out.println("addCardToTop");
//        Card card = null;
//        GroupOfCards instance = null;
//        instance.addCardToTop(card);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of addCardToBottom method, of class GroupOfCards.
     */
//    @Test
//    public void testAddCardToBottom() {
//        System.out.println("addCardToBottom");
//        Card card = null;
//        GroupOfCards instance = null;
//        instance.addCardToBottom(card);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of removeCardsFromTop method, of class GroupOfCards.
     */
    @Test
    public void testRemoveCardsFromTop() {
        System.out.println("removeCardsFromTop");
        int removeCount = 0;
        GroupOfCards instance = null;
        ArrayList<Card> expResult = null;
        ArrayList<Card> result = instance.removeCardsFromTop(removeCount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCardsToTop method, of class GroupOfCards.
     */
    @Test
    public void testAddCardsToTop() {
        System.out.println("addCardsToTop");
        ArrayList<Card> cards = null;
        GroupOfCards instance = null;
        instance.addCardsToTop(cards);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCardsToBottom method, of class GroupOfCards.
     */
    @Test
    public void testAddCardsToBottom() {
        System.out.println("addCardsToBottom");
        ArrayList<Card> cards = null;
        GroupOfCards instance = null;
        instance.addCardsToBottom(cards);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCards method, of class GroupOfCards.
     */
    @Test
    public void testGetCards() {
        System.out.println("getCards");
        GroupOfCards instance = null;
        ArrayList<Card> expResult = null;
        ArrayList<Card> result = instance.getCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class GroupOfCardsImpl extends GroupOfCards {

        public GroupOfCardsImpl() {
            super(null);
        }
    }

}
