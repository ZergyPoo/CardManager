package com.cardmanager.gamedecks;

import com.cardmanager.Card;
import com.cardmanager.Deck;

/**
 * Created with IntelliJ IDEA.
 * User: sudha_000
 * Date: 7/15/13
 * Time: 7:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class HeartsDeck extends Deck {

    private boolean isThreePlayers;

    public HeartsDeck () {
        this(false);
    }

    public HeartsDeck(boolean isThreePlayers) {
        super();
        this.isThreePlayers = isThreePlayers;
        prepareDeck();
    }

    public void prepareDeck() {
        for (String suit : Card.SUIT_LIST) {
            for (int i = 0; i < 13; i++) {
                if (this.isThreePlayers && i == 2 && suit.equals(Card.SUIT_DIAMONDS)) {
                    continue;
                }

                this.cards.add(new Card(i, suit));
            }
        }
    }
}
