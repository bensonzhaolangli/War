/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package war;

/**
 * @author Benson Li, Xavier Faria, Joshua Faria, John Paua
 */
import java.util.ArrayList;

/**
 * This class models a Card Play Area wherein players place their
 * cards to be used during a War Scenario.
 */
public class CardPlayArea extends GroupOfCards {

    private final ArrayList<Card> flippedCards = new ArrayList<>(); //keeps track of which cards are flipped

    /**
     * Constructor
     */
    public CardPlayArea() {
        super(new ArrayList<>());
    }

    /**
     * Access the ArrayList of flipped Cards.
     * @return - the arrayList of flipped Cards. (ArrayList<Card>)
     */
    public ArrayList<Card> getFlippedCards() {
        return this.flippedCards;
    }

    /**
     * Access the last card that was flipped.
     * @return - the most recently flipped Card. (Card)
     */
    public Card getLastFlippedCard(){
        return flippedCards.get(flippedCards.size() - 1);
    }

    /**
     * Marks a card as flipped so that when it is displayed, it's value is shown
     * and not hidden.
     * @param card
     */
    public void flipCard(Card card){
        flippedCards.add(card);
    }

    /**
     * Removes all cards played within the CardPlayArea.
     */
    public void clearFlippedCards(){
        flippedCards.removeAll(flippedCards);
    }
    
    @Override
    public String toString() {
        StringBuilder cardsString = new StringBuilder();
        for (Card card : getCards()) {
            if (flippedCards.contains(card)) {
                cardsString.append(card.toString()).append(" ");
            } else {
                cardsString.append("XX" + " ");
            }
            
        }

        return cardsString.toString();
    }
}
