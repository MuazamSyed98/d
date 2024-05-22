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
 * @modifier Ekenedilichukwu Nwume
 * @studentNumber 991712179
 * @dateModified 2024-05-22
 */
public class CardTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Card[] magicHand = new Card[7];
    Random rand = new Random();
    
    for (int i = 0; i < magicHand.length; i++) {
        Card c = new Card();
        c.setValue(rand.nextInt(13) + 1); // Card values 1-13
        c.setSuit(Card.SUITS[rand.nextInt(4)]); // Random suit
        magicHand[i] = c;
    }
    
    // Hard-coded lucky card
    Card luckyCard = new Card();
    luckyCard.setValue(7); // Example value
    luckyCard.setSuit("Hearts"); // Example suit
    
    boolean found = false;
    for (Card card : magicHand) {
        if (card.getValue() == luckyCard.getValue() && card.getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
            found = true;
            break;
        }
    }
    
    if (found) {
        System.out.println("Congratulations! The lucky card is in the magic hand.");
    } else {
        System.out.println("Sorry, the lucky card is not in the magic hand.");
    }
