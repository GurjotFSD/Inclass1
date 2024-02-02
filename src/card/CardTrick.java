/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that models a hand of 7 cards with random Card objects and allows the user to pick a card.
 * It then searches the array of cards for the match to the user's card.
 * To be used as starting code in Exercise.
 *
 * @author GURJOT SINGH
 * @version 1.0
 * @studentID 991709790
 */
public class CardTrick {

    public static void main(String[] args) {

        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            Random random = new Random();
            card.setValue(random.nextInt(13) + 1); 
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            hand[i] = card;
        }
        
        System.out.println("All 7 cards:");
        for (Card card : hand) {
            System.out.println(card.getSuit() + ' ' + card.getValue());
        }
        
        Card luckyCard = new Card();
        luckyCard.setValue(7); // Example value
        luckyCard.setSuit(Card.SUITS[2]); // Example suit (Diamonds)



        boolean match = false;
        for (Card card : hand) {
            if (card.getValue() == luckyCard.getValue() && card.getSuit() == luckyCard.getSuit()) {
                match = true;
                break;
            }
        }

        if (match) {
            System.out.println("Congratulations! You found the lucky card!");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
    }
    
}

