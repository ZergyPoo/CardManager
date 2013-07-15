package com.cardmanager;

import java.util.HashMap;
import java.util.Map;

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

    public static final String[] SUIT_LIST = { SUIT_CLUBS, SUIT_DIAMONDS, SUIT_HEARTS, SUIT_SPADES };

    public static final Map<Integer, String> VALUE_TO_STRING_VALUE;
    static {
        VALUE_TO_STRING_VALUE = new HashMap<Integer, String>();
        VALUE_TO_STRING_VALUE.put(1, "Ace");
        VALUE_TO_STRING_VALUE.put(11, "Jack");
        VALUE_TO_STRING_VALUE.put(12, "Queen");
        VALUE_TO_STRING_VALUE.put(13, "King");
    }

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

    public static String getStringValue(int val) {
        StringBuilder sb = new StringBuilder();
        if (val >= 2 && val <= 10) {
            sb.append("");
            sb.append(val);
            return sb.toString();
        } else {
            return VALUE_TO_STRING_VALUE.get(new Integer(val));
        }
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
