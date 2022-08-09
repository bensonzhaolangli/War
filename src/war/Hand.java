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
 * This class models a player's hand (the total amount of cards
 * available).
 */
public class Hand extends GroupOfCards {

    /**
     * Constructor that inherits from the Parent class.
     */
    public Hand() {
        super(new ArrayList<>());
    }

    @Override
    public String toString() {
        return "Hand: \uD83C\uDCA0" + this.size();
    }
}
