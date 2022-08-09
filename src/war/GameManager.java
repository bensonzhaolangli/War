package war;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GameManager
{

    private static GameManager _instance = null;

    public static GameManager getInstance()
    {
        if (_instance == null)
            _instance = new GameManager();

        return _instance;
    }

    public int battle(Player player1, Player player2) {
        //both players play a card to their play area
        Card p1Card = player1.playCard();
        Card p2Card = player2.playCard();

        //return false if any of the player has an empty hand
        return p1Card.compareTo(p2Card);
    }

    public int war(Player player1, Player player2) {
        ArrayList<Card> p1Cards = player1.playWarCards();
        ArrayList<Card> p2Cards = player2.playWarCards();

        if (p1Cards == null) {
            return -1;
        } else if (p2Cards == null) {
            return 1;
        } else {

            Card selection = warSelect(p1Cards, player1);
            player1.getPlayArea().getFlippedCards().add(selection);

            Card selection2 = warSelect(p2Cards, player2);
            player2.getPlayArea().getFlippedCards().add(selection2);

            return selection.compareTo(selection2);
        }
    }

    public Card warSelect(ArrayList<Card> pCards,Player player)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("\nPlease select a card to flip, " + player.getName() + ": ");
//            System.out.println("1." + p1Cards.get(0) + " 2." + p1Cards.get(1) + " 3." + p1Cards.get(2) + " 4." + p1Cards.get(3));
        System.out.println("1. XX" + " 2. XX" + " 3. XX" + " 4. XX");

        int pSelectCard = input.nextInt();
        Card pFlippedCard;
        pFlippedCard = switch (pSelectCard) {
            case 1 ->
                    pCards.get(0);
            case 2 ->
                    pCards.get(1);
            case 3 ->
                    pCards.get(2);
            default ->
                    pCards.get(3);
        };

        return pFlippedCard;
    }

    public void start(Player player1, Player player2,Deck deck,int roundNo) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("=========== War Card Game v1.0 ===========");
        //TO DO: add error checking for name input
        System.out.print("Enter player 1 name: ");
        player1.setName(input.nextLine());
        System.out.print("Enter player 2 name: ");
        player2.setName(input.nextLine());

        System.out.println("\n Game Begins! \n");
        //deal cards from deck to both players
        deck.dealToPlayers(player1, player2);

        boolean continueGame = true;
        //battle until one of the players runs out of cards
        while (continueGame) {
            System.out.println("Round " + roundNo + "\n");
            System.out.printf("%-20s %-20s%n", player1.getName(), player2.getName());
            System.out.printf("%-20s  %-20s%n", player1.getHand(), player2.getHand());

            int battleResult = battle(player1, player2);
            System.out.printf("%-20s %-20s%n", "Played: ", "Played: ");
            System.out.printf("%-20s %-20s%n", player1.getPlayArea(), player2.getPlayArea());

            if (battleResult == 1) {
                player1.getHand().addCardToBottom(player1.getPlayArea().removeCardFromTop());
                player1.getHand().addCardToBottom(player2.getPlayArea().removeCardFromTop());
                System.out.println(player1.getName() + " wins the battle! \n");
                System.out.println("Press Enter to Continue!");
                System.in.read();
            } else if (battleResult == -1) {
                player2.getHand().addCardToBottom(player2.getPlayArea().removeCardFromTop());
                player2.getHand().addCardToBottom(player1.getPlayArea().removeCardFromTop());
                System.out.println(player2.getName() + " wins the battle! \n");
                System.out.println("Press Enter to Continue!");
                System.in.read();
            } else {
                System.out.println("\nCards are tied. War begins!");
                int warResult = war(player1, player2);
                System.out.printf("%-20s %-20s%n", "War Played: ", "War Played: ");
                System.out.printf("%-20s %-20s%n", player1.getPlayArea(), player2.getPlayArea());
                //war will repeat until one side wins the war
                while (warResult == 0) {
                    System.out.println("\nWar tied! Start another war!\n");
                    warResult = war(player1, player2);
                    System.out.printf("%-20s %-20s%n", "War Played: ", "War Played: ");
                    System.out.printf("%-20s %-20s%n", player1.getPlayArea(), player2.getPlayArea());
                }
                //determine who takes all the cards in the play areas, based on winner of the war
                if (warResult == 1) {
                    player1.getHand().addCardsToBottom(player1.getPlayArea().removeCardsFromTop(player1.getPlayArea().size()));
                    player1.getHand().addCardsToBottom(player2.getPlayArea().removeCardsFromTop(player2.getPlayArea().size()));
                    System.out.println("\n" + player1.getName() + " wins the war! \n");
                } else {
                    player2.getHand().addCardsToBottom(player1.getPlayArea().removeCardsFromTop(player1.getPlayArea().size()));
                    player2.getHand().addCardsToBottom(player2.getPlayArea().removeCardsFromTop(player2.getPlayArea().size()));
                    System.out.println("\n" + player2.getName() + " wins the war! \n");
                }
                System.out.println("Press Enter to Continue!");
                System.in.read();
            }

            //play area needs to clear flipped cards, so that the next iteration doesn't display cards that shouldn't be flipped
            player1.getPlayArea().clearFlippedCards();
            player2.getPlayArea().clearFlippedCards();

            if (player1.getHand().size() == 0 || player2.getHand().size() == 0) {
                continueGame = false;
            }
            roundNo++;
        }

        if (player1.getHand().size() > player2.getHand().size()) {
            System.out.println("\n" + player1.getName() + " wins the game!\n");
        } else if (player2.getHand().size() > player1.getHand().size()) {
            System.out.println("\n" + player2.getName() + " wins the game!\n");
        } else {
            System.out.println("\nNo winner, game is tied!\n");
        }
    }

}