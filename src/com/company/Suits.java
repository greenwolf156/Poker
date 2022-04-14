package com.company;

public enum Suits {
    SPADES("of spades"),
    DIAMONDS("of diamond"),
    CLUBS("of clubs"),
    HEARTS("of hearts");

    private String value;
    Suits(String spade) {
    }

    public String getValue() {
        return value;
    }
}
