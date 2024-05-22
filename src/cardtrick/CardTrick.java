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
 * @author dancye
 * @modifier Shubarna K C
 * @studentIdNumber 991742618

 */
public class CardTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        
        // Fill the magic hand with random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
             Random rnd = new Random();
            c.setValue(rnd.nextInt(13) + 1);
            c.setSuit(Card.SUITS[rnd.nextInt(4)]);
            magicHand[i] = c;
        }
        
        Card luckyCard = new Card();
        luckyCard.setValue(7); 
        luckyCard.setSuit(Card.SUITS[0]); 

    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of your card (1 to 13): ");
        int userValue = scanner.nextInt();
        System.out.print("Enter the suit of your card (0 for Hearts, 1 for Diamonds, 2 for Spades, 3 for Clubs): ");
        int userSuitIndex = scanner.nextInt();
        String userSuit = Card.SUITS[userSuitIndex];
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                found = true;
                break;
            }
        }

        // Report the result
        if (found) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Your card is not in the magic hand.");
        }
    }


   }
