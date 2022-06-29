package _01_WorkingWithAbstraction._06_CardsWithPower_excs;

public enum CardSuit {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int cardSuitPower;

    CardSuit(int cardSuitPower) {
        this.cardSuitPower = cardSuitPower;
    }

    public int getCardSuitPower() {
        return cardSuitPower;
    }
}
