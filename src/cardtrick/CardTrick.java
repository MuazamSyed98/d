/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cardtrick;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author riya bhandari
 * @student number 991740562
 */

 


public class CardTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
    
Card luckyCard = new Card();
luckyCard.setNumber(7);  // Set the card number to 7
luckyCard.setSuit("Hearts");  // Set the card suit to Hearts
        
   
     
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of your card (1 to 13): ");
        int userValue = scanner.nextInt();
        System.out.print("Enter the suit of your card (0 for Hearts, 1 for Diamonds, 2 for Spades, 3 for Clubs): ");
        int userSuitIndex = scanner.nextInt();
        String userSuit = Card.SUITS[userSuitIndex];
       for (int i = 0; i < hand.length; i++) {
    hand[i] = new Card();
    hand[i].setNumber((int) (Math.random() * 13) + 1);
    hand[i].setSuit(Card.SUITS[(int) (Math.random() * 4)]);
}


       boolean found = false;
        for (Card card : hand) {
            if (card.getNumber() == luckyCard.getNumber() && card.getSuit().equals(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }

        // Output the result
        if (found) {
            System.out.println("You win! The lucky card " + luckyCard + " was found in the hand.");
        } else {
            System.out.println("You lose! The lucky card " + luckyCard + " was not found in the hand.");
        }
    }
}
