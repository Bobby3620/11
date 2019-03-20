package com.company;

/**
 * This is a class that tests the Card class.
 */

public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

        Card c = new Card("Fourth", "Cool", 4);
        Card d = new Card("Fourth", "Cool", 4);


        //For the assignment

        System.out.println(c.rank());
        System.out.println(c.suit());
        System.out.println(c.pointValue());
        System.out.println(c.matches(d));
        System.out.println(c.toString());

    }
}
