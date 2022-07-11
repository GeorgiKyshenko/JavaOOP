package _04_InterfacesAndAbstraction._08_FoodShortage_excs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());

        Map<String, Buyer> buyers = new HashMap<>();

        for (int i = 0; i < numberOfPeople; i++) {

            String input = scanner.nextLine();
            String[] parts = input.split("\\s+");
            String name = parts[0];

            Buyer buyer = parts.length == 3
                    ? new Rebel(name, Integer.parseInt(parts[1]), parts[2])
                    : new Citizen(name, Integer.parseInt(parts[1]), parts[2], parts[3]);

            buyers.put(name, buyer);
        }

        String buyerName = scanner.nextLine();

        while (!buyerName.equals("End")) {

            Buyer buyer = buyers.get(buyerName);

            if (buyer != null) {
                buyer.buyFood();
            }
            buyerName = scanner.nextLine();
        }

        int totalFood = buyers.values().stream().mapToInt(Buyer::getFood).sum();

        System.out.println(totalFood);
    }
}
