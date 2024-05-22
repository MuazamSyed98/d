/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cardtrick;


import java.util.Random;


/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author riya bhandari
 * @student number 991740562
 */

 


public class CardTrick 
{

    public static void main(String[] args)
    {
    Card[] magicHand = new Card[7];
    
    
    // Fill the magic hand with random cards
    for (int i = 0; i < magicHand.length; i++)
    {
        Card c = new Card();
        Random rnd = new Random();
        c.setValue(rnd.nextInt(13) + 1);
        c.setSuit(Card.SUITS[rnd.nextInt(4)]);
        magicHand[i] = c;
    }
    
    // Create luckyCard
    Card luckyCard = new Card();
    luckyCard.setValue(7); 
    luckyCard.setSuit(Card.SUITS[0]); 
    boolean found = false;
    for (Card card : magicHand)
    {
        if (card.getValue() == luckyCard.getValue() && card.getSuit().equals(luckyCard.getSuit())) 
        {
            found = true;
            break;
        }
    }

    
    if (found) {
        System.out.println("Congratulations! You found the lucky card!");
    }
    else
    {
        System.out.println("Sorry, the lucky card is not in the magic hand.");
}
}
}



