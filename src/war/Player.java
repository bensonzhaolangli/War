/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package war;

import java.util.ArrayList;

/**
 * @author Benson Li, Xavier Faria, Joshua Faria, John Paua
 */

/**
 * This class models a Player of the War game. Each player has a Hand to hold their cards,
 * a playArea to play their Cards and a name.
 */
public class Player {

    /**
     * Field Variables
     */
    private final Hand hand;
    private final CardPlayArea playArea;
    private String name;

    /**
     * Constructor
     */
    Player() {
        this("");
    }

    /**
     * Single Parameter Constructor
     * @param name
     */
    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
        this.playArea = new CardPlayArea();
    }

    /**
     * Access the name of the Player.
     * @return - the name of the Player. (String)
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the Player.
     * @param name - the name to set to the Player. (String)
     */
    public void setName(String name) {
        if(!name.matches("[a-zA-Z]+"))
        {
            IllegalArgumentException nameEx = new IllegalArgumentException
                    ("Error: Player Name can only contain letters");
            throw nameEx;
        }
        else
            this.name = name;
    }

    /**
     * Access the Hand of the Player.
     * @return - the Hand of the player. (Hand)
     */
    public Hand getHand() {
        return hand;
    }

    /**
     * Access the CardPlayArea of the Player.
     * @return - the Player's CardPlayArea. (CardPlayArea)
     */
    public CardPlayArea getPlayArea() {
        return playArea;
    }

    /**
     * Play the top card in the current Player's hand.
     * The top Card is then transferred to the Player's CardPlayArea.
     * The transferred card is then flipped.
     * @return - A copy of the Card played. (Card)
     */
    public Card playCard() {
        Card cardPlayed = hand.removeCardFromTop();
        playArea.addCardToTop(cardPlayed);
        //flip the card that was just played
        playArea.flipCard(playArea.getCards().get(playArea.size() - 1));
        return cardPlayed;
    }

    /**
     * Play the necessary (4) cards for the War Scenario.
     *
     * @return - An ArrayList of Cards of the Cards played. If there are not
     * enough card then return null.
     */
    public ArrayList<Card> playWarCards() {
        //4 cards are played
        int playCount = 4;
        ArrayList<Card> cardsPlayed = null;
        if (this.hand.size() >= 4) {
            cardsPlayed = hand.removeCardsFromTop(playCount);
            playArea.addCardsToTop(cardsPlayed);
//            playArea.flipCard(playArea.getCards().get(playArea.size() - 1));
        }

        return cardsPlayed;
    }
}
