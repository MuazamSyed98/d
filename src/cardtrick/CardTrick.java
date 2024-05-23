/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cardtrick;
import java.util.Scanner;
import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
public class CardTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        
        for (int i=0; i<magicHand.length; i++)
        {
            int randomValue = rnd.nextInt(13);
            int randomSuit = rnd.nextInt(3);
            
            Card c = new Card();
            c.setValue(randomValue);
            c.setSuit(Card.SUITS[randomSuit]);
        }
        
        System.out.print("Enter the card value (1 - 1): ");
        int valueChoice = sc.nextInt();
        
        System.out.print("Enter the card suit (0 = Hearts, 1 = Diamonds, 2 = Spades, 3 = Clubs): ");
        int suitChoice = sc.nextInt();

        // and search magicHand here
        
        //Then report the result here
   }
    
}
