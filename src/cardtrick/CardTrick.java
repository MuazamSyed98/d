package cardtrick;
import java.util.Scanner;
import java.util.Random;

/**
 * Name: Muhammad Ansari
 * Student #: 991717324
 * Application description: Fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card.
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
        
        for (int i = 0; i < magicHand.length; i++) {
            int randomValue = rnd.nextInt(13) + 1; // Card values 1-13
            int randomSuit = rnd.nextInt(4); // Suit index 0-3
            
            Card c = new Card();
            c.setValue(randomValue);
            c.setSuit(Card.SUITS[randomSuit]);
            
            magicHand[i] = c;
        }
        
        System.out.print("Enter the card value (1 - 13): ");
        int valueChoice = sc.nextInt();
        
        System.out.print("Enter the card suit (0 = Hearts, 1 = Diamonds, 2 = Spades, 3 = Clubs): ");
        int suitChoice = sc.nextInt();
        
        String suitChoiceStr = Card.SUITS[suitChoice];
        
        boolean rightChoice = false;
        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getValue() == valueChoice && magicHand[i].getSuit().equals(suitChoiceStr)) {
                rightChoice = true;
                break;
            }
        }
        
        if (rightChoice) {
            System.out.println("Your guess was CORRECT!");
        } else {
            System.out.println("Sorry, your guess was WRONG.");
        }
    }
}

