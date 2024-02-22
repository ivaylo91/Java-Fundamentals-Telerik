package com.java.loops;

import java.util.Scanner;

public class DeckOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        //create string of all cards
        String strCards = "2 3 4 5 6 7 8 9 10 J Q K A";

        //create array of strings with card signs
        String[] cardSign = strCards.split(" ");

        //create array of all cards suits
        String[] suits = {"spades", "clubs", "hearts", "diamonds"};

        //iterate through array of suits up scanned sign included
        for (String card : cardSign) {
            //nested iteration with suits for every sign
            for (String suit : suits) {
                if (suit.equals("diamonds")) {
                    System.out.print(card + " of " + suit);
                } else {
                    System.out.print(card + " of " + suit + ", ");
                }
            }
            //when reach card sign equal to input sign we stop iterating
            if (card.equals(input)) {
                break;
            }
            System.out.println();
        }
    }
}
