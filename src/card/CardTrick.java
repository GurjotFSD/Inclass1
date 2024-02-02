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
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a card:");
        System.out.print("Enter value (1-13): ");
        int userValue = scanner.nextInt();
        System.out.print("Enter suit (1-4): ");
        String userSuit = scanner.next();

        boolean match = false;
        for (Card card : hand) {
            if (card.getValue() == userValue) 
            {
                if (card.getSuit().equals(userSuit)) 
                {
                    match = true;
                    break;
                }
            }
        }

        if (match) {
            printInfo();
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
    }
    private static void printInfo() {
        System.out.println("Congratulations, you guessed right!");
        System.out.println();

        System.out.println("My name is Your Name");
        System.out.println();

        System.out.println("My career ambitions:");
        System.out.println("-- Replace with your career ambitions");

        System.out.println("My hobbies:");
        System.out.println("-- Replace with your hobbies");

        System.out.println();
    }
}

