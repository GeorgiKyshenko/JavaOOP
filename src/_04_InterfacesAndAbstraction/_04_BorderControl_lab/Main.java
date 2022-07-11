package _04_InterfacesAndAbstraction._04_BorderControl_lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Identifiable> identifiableList = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            String[] parts = input.split("\\s+");

            Identifiable identifiable = parts.length == 2
                    ? new Robot(parts[1], parts[0])
                    : new Citizen(parts[2], Integer.parseInt(parts[1]), parts[0]);

            identifiableList.add(identifiable);

            input = scanner.nextLine();
        }

        String fakeIDEnds = scanner.nextLine();

        identifiableList.stream()
                .map(Identifiable::getId)
                .filter(el -> el.endsWith(fakeIDEnds))
                .forEach(System.out::println);
    }
}
