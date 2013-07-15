package com.cardmanager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sudha_000
 * Date: 7/15/13
 * Time: 7:11 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Deck {
    protected List<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();
    }

    public int size() {
        return cards.size();
    }

    public abstract void prepareDeck();
}
