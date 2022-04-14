package com.company.test;

import com.company.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TheTest {

    @Test
    public void testAdd() {
        Card card = new Card(Faces.ACE, Suits.CLUBS);
        assertEquals("the card wrong value", 1, card.getCardValue());
    }

    @Test
    public void testDeck() {
        Deck deck = new Deck();
        assertEquals("Deck wrong size", 52, deck.getSize());
    }

    @Test
    public void testRoyalFlush() {
        Deck deck = new Deck();
        List<Card> cards = new ArrayList<>();
        cards.add(new Card(Faces.TEN,Suits.CLUBS));
        cards.add(new Card(Faces.JACK,Suits.CLUBS));
        cards.add(new Card(Faces.QUEEN,Suits.CLUBS));
        cards.add(new Card(Faces.KING,Suits.CLUBS));
        cards.add(new Card(Faces.ACE,Suits.CLUBS));
        Hand hand = new Hand(cards);
        assertTrue(CheckHand.isRoyalFlush(hand));
    }

    @Test
    public void testFlush() {
        Deck deck = new Deck();
        List<Card> cards = new ArrayList<>();
        cards.add(new Card(Faces.SIX,Suits.CLUBS));
        cards.add(new Card(Faces.SEVEN,Suits.CLUBS));
        cards.add(new Card(Faces.EIGHT,Suits.CLUBS));
        cards.add(new Card(Faces.NINE,Suits.CLUBS));
        cards.add(new Card(Faces.TEN,Suits.CLUBS));
        Hand hand = new Hand(cards);
        assertTrue(CheckHand.isFlush(hand));
    }

    @Test
    public void testIsFourOfAKind() {
        List<Card> cards = new ArrayList<>();
        cards.add(new Card(Faces.FOUR,Suits.CLUBS));
        cards.add(new Card(Faces.FOUR,Suits.HEARTS));
        cards.add(new Card(Faces.FOUR,Suits.SPADES));
        cards.add(new Card(Faces.FOUR,Suits.DIAMONDS));
        cards.add(new Card(Faces.EIGHT,Suits.CLUBS));
        Hand hand = new Hand(cards);
        assertTrue(CheckHand.isFourOfAKind(hand));
        cards = new ArrayList<>();
        cards.add(new Card(Faces.TWO,Suits.CLUBS));
        cards.add(new Card(Faces.FOUR,Suits.HEARTS));
        cards.add(new Card(Faces.FOUR,Suits.SPADES));
        cards.add(new Card(Faces.FOUR,Suits.DIAMONDS));
        cards.add(new Card(Faces.EIGHT,Suits.CLUBS));
        hand = new Hand(cards);
        assertFalse(CheckHand.isFourOfAKind(hand));
    }

    @Test
    public void testIsThreeOfAKind() {
        List<Card> cards = new ArrayList<>();
        cards.add(new Card(Faces.FOUR,Suits.CLUBS));
        cards.add(new Card(Faces.FOUR,Suits.HEARTS));
        cards.add(new Card(Faces.FOUR,Suits.SPADES));
        cards.add(new Card(Faces.THREE,Suits.DIAMONDS));
        cards.add(new Card(Faces.EIGHT,Suits.CLUBS));
        Hand hand = new Hand(cards);
        assertTrue(CheckHand.isThreeOfAKind(hand));
        cards = new ArrayList<>();
        cards.add(new Card(Faces.TWO,Suits.CLUBS));
        cards.add(new Card(Faces.SIX,Suits.HEARTS));
        cards.add(new Card(Faces.FOUR,Suits.SPADES));
        cards.add(new Card(Faces.FOUR,Suits.DIAMONDS));
        cards.add(new Card(Faces.EIGHT,Suits.CLUBS));
        hand = new Hand(cards);
        assertFalse(CheckHand.isThreeOfAKind(hand));
    }
}
