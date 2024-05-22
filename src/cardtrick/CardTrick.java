/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cardtrick;
import static cardtrick.Card.SUITS;
//import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 * @author Sabahat Faheem
 * Student ID 991748127
 */
public class CardTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //create a random value from 1 to 13, set value for c
            Random random = new Random();
            c.setValue(random.nextInt(13) + 1);
            //generate random value for SUIT index
            c.setSuit(Card.SUITS[random.nextInt(SUITS.length)]);
            //populates the magicHand array
            magicHand[i] = c;
        }
        Card luckyCard = new Card();
        luckyCard.setValue(3);
        luckyCard.setSuit("Diamonds");
        
//        try ( //insert code to ask the user for Card value and suit, create their card
//                Scanner scanner = new Scanner(System.in)) {
//            System.out.println("\nEnter card value 1-13: ");
//            int userVal = scanner.nextInt();
//            scanner.nextLine();
//            System.out.println("Enter card suit(Hearts, Diamonds, Spades, Clubs): ");
//            String userSuit = scanner.nextLine();
//            Card userCard = new Card();
//            
//            userCard.setValue(userVal);
//            userCard.setSuit(userSuit);
        
        
        boolean match = false;
            
            // and search magicHand here
            for(Card cards:magicHand){
                if(cards.equals(luckyCard)){
                    match = true;
                }
                break;
            }
            
            //Then report the result here
            if (match == true) {
                System.out.println("Winner!, Your card was found in the magic hand!");
            } else {
                System.out.println("Your card was not found in the magic hand.");
            }
        }
    }
    
    
