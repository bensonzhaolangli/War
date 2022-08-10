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
public class GameManagerIT {

    public GameManagerIT() {
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
     * Test of battle method, of class GameManager.
     */
    @Test
    public void testBattleGreaterThan() {
        System.out.println("Test Battle Greater Than");
        Card p1Card = new Card(Card.Rank.ACE, Card.Suit.CLUBS);
        Card p2Card = new Card(Card.Rank.EIGHT, Card.Suit.DIAMONDS);
        int result = p1Card.compareTo(p2Card);
        assertEquals(1, result);
    }

    @Test
    public void battleLessThan() {
        Card p1Card = new Card(Card.Rank.FOUR, Card.Suit.CLUBS);
        Card p2Card = new Card(Card.Rank.EIGHT, Card.Suit.DIAMONDS);
        int result = p1Card.compareTo(p2Card);
        assertEquals(-1, result);
    }

    @Test
    public void battleEqual() {
        Card p1Card = new Card(Card.Rank.ACE, Card.Suit.CLUBS);
        Card p2Card = new Card(Card.Rank.ACE, Card.Suit.DIAMONDS);
        int result = p1Card.compareTo(p2Card);
        assertEquals(0, result);
    }

    @Test
    public void warCompareLessThan() {
        // Create an arrayList of WarCards from each player.
        ArrayList<Card> p1Cards = new ArrayList<Card>();
        Card p1Card1 = new Card(Card.Rank.FOUR, Card.Suit.CLUBS);
        p1Cards.add(p1Card1);
        Card p1Card2 = new Card(Card.Rank.SIX, Card.Suit.CLUBS);
        p1Cards.add(p1Card2);
        Card p1Card3 = new Card(Card.Rank.EIGHT, Card.Suit.CLUBS);
        p1Cards.add(p1Card3);

        ArrayList<Card> p2Cards = new ArrayList<Card>();
        Card p2Card1 = new Card(Card.Rank.FIVE, Card.Suit.CLUBS);
        p2Cards.add(p2Card1);
        Card p2Card2 = new Card(Card.Rank.SEVEN, Card.Suit.CLUBS);
        p2Cards.add(p2Card2);
        Card p2Card3 = new Card(Card.Rank.NINE, Card.Suit.CLUBS);
        p2Cards.add(p2Card3);

        Card selectionPlayer1 = p1Cards.get(0);
        Card selectionPlayer2 = p2Cards.get(2);

        int result = selectionPlayer1.compareTo(selectionPlayer2);
        assertEquals(-1, result);
    }

    @Test
    public void warCompareGreaterThan() {
        // Create an arrayList of WarCards from each player.
        ArrayList<Card> p1Cards = new ArrayList<Card>();
        Card p1Card1 = new Card(Card.Rank.FOUR, Card.Suit.CLUBS);
        p1Cards.add(p1Card1);
        Card p1Card2 = new Card(Card.Rank.SIX, Card.Suit.CLUBS);
        p1Cards.add(p1Card2);
        Card p1Card3 = new Card(Card.Rank.EIGHT, Card.Suit.CLUBS);
        p1Cards.add(p1Card3);

        ArrayList<Card> p2Cards = new ArrayList<Card>();
        Card p2Card1 = new Card(Card.Rank.FIVE, Card.Suit.CLUBS);
        p2Cards.add(p2Card1);
        Card p2Card2 = new Card(Card.Rank.SEVEN, Card.Suit.CLUBS);
        p2Cards.add(p2Card2);
        Card p2Card3 = new Card(Card.Rank.NINE, Card.Suit.CLUBS);
        p2Cards.add(p2Card3);

        Card selectionPlayer1 = p1Cards.get(2);
        Card selectionPlayer2 = p2Cards.get(0);

        int result = selectionPlayer1.compareTo(selectionPlayer2);
        assertEquals(1, result);
    }

    @Test
    public void warCompareEqualTo() {
        // Create an arrayList of WarCards from each player.
        ArrayList<Card> p1Cards = new ArrayList<Card>();
        Card p1Card1 = new Card(Card.Rank.FOUR, Card.Suit.CLUBS);
        p1Cards.add(p1Card1);
        Card p1Card2 = new Card(Card.Rank.SIX, Card.Suit.CLUBS);
        p1Cards.add(p1Card2);
        Card p1Card3 = new Card(Card.Rank.EIGHT, Card.Suit.CLUBS);
        p1Cards.add(p1Card3);

        ArrayList<Card> p2Cards = new ArrayList<Card>();
        Card p2Card1 = new Card(Card.Rank.FIVE, Card.Suit.CLUBS);
        p2Cards.add(p2Card1);
        Card p2Card2 = new Card(Card.Rank.SIX, Card.Suit.CLUBS);
        p2Cards.add(p2Card2);
        Card p2Card3 = new Card(Card.Rank.NINE, Card.Suit.CLUBS);
        p2Cards.add(p2Card3);

        Card selectionPlayer1 = p1Cards.get(1);
        Card selectionPlayer2 = p2Cards.get(1);

        int result = selectionPlayer1.compareTo(selectionPlayer2);
        assertEquals(0, result);
    }

    @Test
    public void warSelectGood() {
        ArrayList<Card> pCards = new ArrayList<Card>();
        Card pCard1 = new Card(Card.Rank.FOUR, Card.Suit.CLUBS);
        pCards.add(pCard1);
        Card pCard2 = new Card(Card.Rank.SIX, Card.Suit.CLUBS);
        pCards.add(pCard2);
        Card pCard3 = new Card(Card.Rank.EIGHT, Card.Suit.CLUBS);
        pCards.add(pCard3);

        int selectedCard = 1;
        Card flippedCard;
        flippedCard = switch (selectedCard) {
            case 1 ->
                pCards.get(0);
            case 2 ->
                pCards.get(1);
            case 3 ->
                pCards.get(2);
            default ->
                pCards.get(3);
        };

        Card result = pCards.get(1);
        assertEquals(new Card(Card.Rank.SIX, Card.Suit.CLUBS), result);
    }

    @Test
    public void warSelectBad() {
        ArrayList<Card> pCards = new ArrayList<Card>();
        Card pCard1 = new Card(Card.Rank.FOUR, Card.Suit.CLUBS);
        pCards.add(pCard1);
        Card pCard2 = new Card(Card.Rank.SIX, Card.Suit.CLUBS);
        pCards.add(pCard2);
        Card pCard3 = new Card(Card.Rank.EIGHT, Card.Suit.CLUBS);
        pCards.add(pCard3);

        int selectedCard = 1;
        Card flippedCard;
        flippedCard = switch (selectedCard) {
            case 1 ->
                pCards.get(0);
            case 2 ->
                pCards.get(1);
            case 3 ->
                pCards.get(2);
            default ->
                pCards.get(3);
        };

        Card result = new Card();
        assertEquals(new Card(Card.Rank.TWO, Card.Suit.HEARTS), result);
    }
}


