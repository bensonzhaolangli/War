/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package war;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * @author benso
 */
public class Game {

    private final Deck deck;
    private final Player player1;
    private final Player player2;
    private int roundNo;

    static GameManager gm = new GameManager();

    public Game() {
        this.deck = new Deck();
        this.player1 = new Player();
        this.player2 = new Player();
        this.roundNo = 1;
    }

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Game game = new Game();
        try {
            gm.start(game.player1, game.player2, game.deck, game.roundNo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}