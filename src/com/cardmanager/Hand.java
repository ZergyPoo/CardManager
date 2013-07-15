package com.cardmanager;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: sudha_000
 * Date: 7/15/13
 * Time: 9:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class Hand {
    private Map<Card, Card> cards;

    public Hand() {
        cards = new HashMap<Card, Card>();
    }

    public void addCard(Card c) {
        cards.put(c, c);
    }

    public Card removeCard(Card c) {
        return cards.remove(c);
    }

    public int size() {
        return this.cards.size();
    }

    public Collection<Card> getCards() {
        return this.cards.values();
    }
}
