package com.cardmanager;

/**
 * Created with IntelliJ IDEA.
 * User: sudha_000
 * Date: 7/15/13
 * Time: 7:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class Card {

    public static final String SUIT_CLUBS = "Clubs";
    public static final String SUIT_HEARTS = "Hearts";
    public static final String SUIT_DIAMONDS = "Diamonds";
    public static final String SUIT_SPADES = "Spades";

    private String suit;
    private int value;

    public Card() {}

    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;

        Card card = (Card) o;

        if (value != card.value) return false;
        if (!suit.equals(card.suit)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = suit.hashCode();
        result = 31 * result + value;
        return result;
    }
}
