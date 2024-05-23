package cardtrick;
import java.util.Scanner;
import java.util.Random;

/**
 * Name: Muhammad Ansari
 * Student #: 991717324
 * Application description: Fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card.
 * @author Muhammad Ansari
 * date modified: May 22, 2024
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

        Card luckyCard = new Card();
        luckyCard.setValue(3);
        luckyCard.setSuit("Diamonds");
        
        boolean rightChoice = false;
        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getValue() == luckyCard.getValue() && magicHand[i].getSuit().equals(luckyCard.getSuit())) {
                rightChoice = true;
                break;
            }
        }
        
        if (rightChoice) {
            System.out.println("Congratulation, YOU WON!");
        } else {
            System.out.println("Sorry, YOU LOST!.");
        }
    }
}

