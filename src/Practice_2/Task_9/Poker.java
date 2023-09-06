package Practice_2.Task_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество игроков: ");
        int numPlayers = scanner.nextInt();

        List<String> deck = createDeck();

        Collections.shuffle(deck);

        for (int i = 0; i < numPlayers; i++) {
            List<String> hand = dealHand(deck);
            System.out.println("Игрок " + (i + 1) + ":");
            for (String card : hand) {
                System.out.println(card);
            }
            System.out.println();
        }
    }

    // Создание колоды карт
    private static List<String> createDeck() {
        List<String> deck = new ArrayList<>();
        String[] suits = {"Пики", "Черви", "Бубны", "Крести"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " " + suit);
            }
        }

        return deck;
    }

    // Раздача карт
    private static List<String> dealHand(List<String> deck) {
        List<String> hand = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            hand.add(deck.remove(0));
        }
        return hand;
    }
}
