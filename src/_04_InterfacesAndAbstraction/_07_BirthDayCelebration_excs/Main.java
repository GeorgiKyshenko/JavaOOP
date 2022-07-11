package _04_InterfacesAndAbstraction._07_BirthDayCelebration_excs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Birthable> birthDates = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            String[] inputParts = input.split("\\s+");
            String createType = inputParts[0];

            switch (createType) {
                case "Citizen":
                    Birthable citizen = new Citizen(inputParts[1], Integer.parseInt(inputParts[2]), inputParts[3], inputParts[4]);
                    birthDates.add(citizen);
                    break;
                case "Pet":
                    Birthable pet = new Pet(inputParts[1], inputParts[2]);
                    birthDates.add(pet);
                    break;
                case "Robot":
                    // TODO: 7/11/2022 - add robots if needed!
                    break;
            }
            input = scanner.nextLine();
        }

        String year = scanner.nextLine();

        birthDates.stream()
                .map(Birthable::getBirthDay)
                .filter(el -> el.endsWith(year))
                .forEach(System.out::println);

    }
}
