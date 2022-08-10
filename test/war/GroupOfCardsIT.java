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
     * the size method returns the correct size. An input of a hand containing 6
     * cards is
     */
    @Test
    public void testSize() {
        System.out.println("Test size() good");
        Hand testHand = new Hand();

        for (int i = 0; i < 10; i++) {
            testHand.addCardToTop(new Card(Card.Rank.ACE, Card.Suit.CLUBS));
        }

        int result = testHand.size();

        assertEquals(10, result);
    }

    /**
     * Test of isEmpty method, of class GroupOfCards. Ensure that an empty hand
     * will return true. Good input of empty hand.
     */
    @Test
    public void testIsEmptyGood() {
        System.out.println("Test isEmpty() Good");
        Hand testHand = new Hand();

        boolean result = testHand.isEmpty();
        assertEquals(true, result);
    }

    /**
     * Test of isEmpty method, of class GroupOfCards. Ensure that bad input of
     * hand with two cards, will return false;
     */
    @Test
    public void testIsEmptyBad() {
        System.out.println("Test isEmpty() Bad");
        Hand testHand = new Hand();
        testHand.addCardToTop(new Card(Card.Rank.ACE, Card.Suit.CLUBS));
        testHand.addCardToTop(new Card(Card.Rank.FOUR, Card.Suit.HEARTS));

        boolean result = testHand.isEmpty();
        assertEquals(false, result);
    }

    /**
     * Test of isEmpty method, of class GroupOfCards. Ensure that boundary input
     * of hand with 1 card, will return false.
     */
    @Test
    public void testIsEmptyBoundary() {
        System.out.println("Test isEmpty() Boundary");
        Hand testHand = new Hand();
        testHand.addCardToTop(new Card(Card.Rank.ACE, Card.Suit.CLUBS));

        boolean result = testHand.isEmpty();
        assertEquals(false, result);
    }

    /**
     * Test of removeCardFromTop method, of class GroupOfCards. This method
     * gives a good input of a hand with three cards. We will test to ensure,
     * that the card removed from the hand, will be the card that was at the top
     * of the hand.
     */
    @Test
    public void testRemoveCardFromTopGood() {
        System.out.println("Test removeCardFromTop() Good");

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
        System.out.println("Test removeCardFromTop Bad");

        //Create an empty hand
        Hand testHand = new Hand();

        //Call the removeCardFromTop() method on the empty hand
        Card result = testHand.removeCardFromTop();

        //There should be null returned, since no Card object was removed
        assertEquals(null, result);
    }

    /**
     * Test of removeCardFromBottom method, of class GroupOfCards. This test
     * will give a good input of removing a card from a hand of 3 cards. This
     * test will ensure that the Card object returned will be the card removed
     * from the bottom of the hand.
     */
    @Test
    public void testRemoveCardFromBottomGood() {
        System.out.println("Test removeCardFromBottom() Good");

        //Create a hand composed of three cards. The top card in the hand
        //is a Jack of Diamonds
        Hand testHand = new Hand();
        testHand.addCardToTop(new Card(Card.Rank.ACE, Card.Suit.CLUBS));
        testHand.addCardToTop(new Card(Card.Rank.FOUR, Card.Suit.HEARTS));
        testHand.addCardToTop(new Card(Card.Rank.JACK, Card.Suit.DIAMONDS));

        //Call the removeCardFromTop() method on the group of cards
        Card result = testHand.removeCardFromBottom();

        //Store the card returned from removeCardFromTop() in variable result
        Card expectedCardRemoved = new Card(Card.Rank.ACE, Card.Suit.CLUBS);
        //The card removed should be Jack of Diamonds, since it was the top
        //card in the hand
        assertEquals(expectedCardRemoved, result);
    }

    /**
     * Test of removeCardFromBottom method, of class GroupOfCards. This test
     * will give a good input of removing a card from a hand of 3 cards. This
     * test will ensure that the Card object returned will be the card removed
     * from the bottom of the hand.
     */
    @Test
    public void testRemoveCardFromBottomBad() {
        System.out.println("Test removeCardFromBottom() Good");

        //Create a hand composed of three cards. The top card in the hand
        //is a Jack of Diamonds
        Hand testHand = new Hand();

        //Call the removeCardFromTop() method on the group of cards
        Card result = testHand.removeCardFromBottom();

        assertEquals(null, result);
    }

    /**
     * Test of removeCardsFromTop method, of class GroupOfCards. This test will
     * give a good input of removing 2 cards from a hand of 3 cards. Ensure that
     * the two cards removed will be returned as a List.
     */
    @Test
    public void testRemoveCardsFromTopGood() {
        System.out.println("Test removeCardsFromTop() Good");
        int removeCount = 2;

        Hand testHand = new Hand();
        testHand.addCardToTop(new Card(Card.Rank.ACE, Card.Suit.CLUBS));
        testHand.addCardToTop(new Card(Card.Rank.FOUR, Card.Suit.HEARTS));
        testHand.addCardToTop(new Card(Card.Rank.JACK, Card.Suit.DIAMONDS));

        ArrayList<Card> result = testHand.removeCardsFromTop(removeCount);
        
        ArrayList<Card> expResult = new ArrayList<>();
        expResult.add(new Card(Card.Rank.JACK, Card.Suit.DIAMONDS));
        expResult.add(new Card(Card.Rank.FOUR, Card.Suit.HEARTS));

        
        assertEquals(expResult, result);
    }
    
        /**
     * Test of removeCardsFromTop method, of class GroupOfCards. This test will
     * give a bad input of removing cards form empty hand. Will return an empty
     * List.
     */
    @Test
    public void testRemoveCardsFromTopBad() {
        System.out.println("Test removeCardsFromTop() Bad");
        int removeCount = 2;

        Hand testHand = new Hand();

        ArrayList<Card> result = testHand.removeCardsFromTop(removeCount);
        
        ArrayList<Card> expResult = new ArrayList<>();
        
        assertEquals(null, result);
    }

    public class GroupOfCardsImpl extends GroupOfCards {

        public GroupOfCardsImpl() {
            super(null);
        }
    }

}
