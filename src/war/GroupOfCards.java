/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package war;

/**
 * @author Benson Li, Xavier Faria, Joshua Faria, John Paua
 */

import java.util.ArrayList;

/**
 * This class models a group of cards, which any collection of cards will inherit from.
 */
abstract class GroupOfCards {

    ArrayList<Card> cards;

    /**
     * Single Parameter Constructor
     * @param cards - an ArrayList of Cards. (ArrayList<Cards>)
     */
    public GroupOfCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    /**
     * Return the size of the current GroupOfCards object.
     * @return - the number of cards in a GroupOfCards. (int)
     */
    public int size() {
        return cards.size();
    }

    /**
     * Check to see if the cards ArrayList is empty.
     * @return - True or False pending on whether the ArrayList is empty or not. (boolean)
     */
    public boolean isEmpty() {
        return cards.isEmpty();
    }

    /**
     * remove a Card object from the end of the cards ArrayList
     * @return the Card that is removed, return null is no Cards. (Card)
     */
    public Card removeCardFromTop() {
        return (size() > 0) ? cards.remove(size() - 1) : null;
    }

    /**
     * Removes the first Card object in the cards ArrayList.
     * @return - the Card that is removed, return null if there are no cards. (Card)
     */
    public Card removeCardFromBottom() {
        return (size() > 0) ? cards.remove(0) : null;
    }

    /**
     * Add a Card to the bottom of the cards ArrayList.
     * @param card - the Card to be added. (Card)
     */
    public void addCardToTop(Card card) {
        cards.add(card);
    }

    /**
     * Add a Card to the bottom of the cards ArrayList.
     * @param card - the Card to be added. (Card)
     */
    public void addCardToBottom(Card card) {
        cards.add(0, card);
    }

    /**
     * Remove multiple Cards from the top of the cards ArrayList.
     * @param removeCount - the amount of Cards to be removed.
     * @return - An ArrayList of the removed cards. (ArrayList<Card>)
     */
    public ArrayList<Card> removeCardsFromTop(int removeCount) {
        ArrayList<Card> removedCards = new ArrayList<>();
        for (int i = 0; i < removeCount; i++) {
            removedCards.add(this.cards.remove(this.size() - 1));
        }
        return removedCards;
    }

    /**
     * Append an ArrayList of Cards to the current cards ArrayList.
     * @param cards - the Cards to be added. (ArrayList<Card>)
     */
    public void addCardsToTop(ArrayList<Card> cards) {
        this.cards.addAll(cards);
    }

    /**
     * Add an ArrayList of Cards to the beginning of the cards ArrayList.
     * @param cards - the Cards to be added. (Arrayist<Card>)
     */
    public void addCardsToBottom(ArrayList<Card> cards) {
        this.cards.addAll(0, cards);
    }

    /**
     * Access the cards ArrayList.
     * @return - the cards ArrayList. (ArrayList<Card>)
     */
    public ArrayList<Card> getCards() {
        return cards;
    }
}
