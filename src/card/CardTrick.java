/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        // Add one luck card hard coded to 2 of Clubs
        Card luckCard = new Card();
        luckCard.setValue(2);
        luckCard.setSuit("Clubs");
        
        // Display the luck card
        System.out.println("Lucky Card: " + luckCard.getValue() + " of " + luckCard.getSuit());

        // Search for the lucky card in the magic hand
        boolean luckyFound = false;
        for (Card card : magicHand) {
            if (card.getValue() == luckyCard.getValue() && card.getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
                luckyFound = true;
                break;
            }
        }
        
        if (luckyFound) {
            System.out.println("The lucky card is in the magic hand! You win!");
        } else {
            System.out.println("The lucky card is not in the magic hand. You lose.");
        }
    
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
    }
    
}
