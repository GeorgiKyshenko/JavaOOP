package _01_WorkingWithAbstraction._06_CardsWithPower_excs;

public class Card {
    private CardRank cardRank;
    private CardSuit cardSuit;

    public Card(CardRank cardRank, CardSuit cardSuit) {
        this.cardRank = cardRank;
        this.cardSuit = cardSuit;
    }

    public CardRank getCardRank() {
        return cardRank;
    }

    public CardSuit getCardSuit() {
        return cardSuit;
    }

    public int getPower() {
        return cardRank.getCardRankPower() + cardSuit.getCardSuitPower();
    }
}
