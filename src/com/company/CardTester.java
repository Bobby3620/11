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

        Card c = new Card("Sixth", "Cool", 4);
        Card d = new Card("Sixth", "Cool", 4);

        //For activity one

        System.out.println(c.rank());
        System.out.println(c.suit());
        System.out.println(c.pointValue());
        System.out.println(c.matches(d));
        System.out.println(c.toString());


        //For activity two

        String[] ranks = new String[]{"a" , "b", "c"};
        String[] suits = new String[]{"1" , "2"};
        int[] value = new int[]{1, 3, 5};

        Deck e = new Deck(ranks, suits, value);
        System.out.println(e.size());
        System.out.println(e.isEmpty());



    }
}
