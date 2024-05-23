/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cardtrick;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Katie Reeves 991568934
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
            Random rand = new Random();
            
            // make sure card value is in range 1-13
            int cardValue = rand.nextInt(14);
            while(cardValue == 0) cardValue = rand.nextInt(14);
            
            c.setValue(cardValue);
            
            // generate random index within bounds of 0-3
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner scannerObj = new Scanner(System.in);

        Card userCard = new Card();
        Boolean validUserInput = false;
        int userInputInteger = 0;

        while(!validUserInput){
            System.out.print("Enter your card's rank-value (1-13): ");
            
            // filter out garbage input, loop until input is proper
            try{
                // if not int goes to catch, then loops
                userInputInteger = Integer.parseInt(scannerObj.nextLine());
                // if not between 1 and 13, will error then loop
                if(userInputInteger > 13 || userInputInteger < 1)
                    throw new NullPointerException();
                
                userCard.setValue(userInputInteger);
                validUserInput = true;
            }
            catch(Exception e){
                System.out.println("Error: invalid input. Please input a value from 1-13.");
            }
        }
        userCard.setValue(userInputInteger);

        System.out.println("Enter your card's suit as a numerical value as stipulated bellow.");
        System.out.print(" Hearts: 0\n Diamonds: 1\n Spades: 2\n Clubs: 3\nCard Suit: ");
        
        // same as before, but between 0 and 3
        userInputInteger = 0;
        validUserInput = false;

        while(!validUserInput){
            System.out.print("Enter your card's suit's numerical value (0-3): ");
            
            // filter out garbage input, loop until input is proper
            try{
                // if not int goes to catch, then loops
                userInputInteger = Integer.parseInt(scannerObj.nextLine());
                // if not between 1 and 13, will error then loop
                if(userInputInteger > 3 || userInputInteger < 0)
                    throw new NullPointerException();
                
                validUserInput = true;
            }
            catch(Exception e){
                System.out.println("Error: invalid input. Please input a value from 0-3.");
            }
        }
        
       userCard.setSuit(Card.SUITS[userInputInteger]);
        
        // and search magicHand here
        Boolean cardInHand = false;

        for(int i = 0; i < magicHand.length; i++){
            if(magicHand[i].getSuit().equals(userCard.getSuit())
               && magicHand[i].getValue() == userCard.getValue()){
                cardInHand = true;
            }
        }
        
        //Then report the result here
        // ternary operator to clean up output
        String resultString = cardInHand == true ? " is in hand" : " is not in hand";
        System.out.println(userCard.getValue() + " of " + userCard.getSuit() + resultString);
   }
    
}
