package _01_WorkingWithAbstraction._06_CardsWithPower_excs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CardRank cardRank = CardRank.valueOf(scanner.nextLine());
        CardSuit cardSuit = CardSuit.valueOf(scanner.nextLine());

        Card card = new Card(cardRank,cardSuit);

        System.out.printf("Card name: %s of %s; Card power: %d%n",card.getCardRank(),card.getCardSuit(),card.getPower());
    }
}
