package _01_WorkingWithAbstraction._08_JediGalaxy_excs;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readPosition(scanner.nextLine());
        int rows = dimensions[0];
        int cols = dimensions[1];

        Field field = new Field(rows, cols);
        Galaxy galaxy = new Galaxy(field);

        String command = scanner.nextLine();


        while (!command.equals("Let the Force be with you")) {
            int[] jediPosition = readPosition(command);
            int[] evilPosition = readPosition(scanner.nextLine());

            int currentRowEvil = evilPosition[0];
            int currentColEvil = evilPosition[1];

            galaxy.moveEvil(currentRowEvil, currentColEvil);

            int currentRowJedi = jediPosition[0];
            int currentColJedi = jediPosition[1];

            long starCollected = galaxy.moveJedi(currentRowJedi, currentColJedi);

            command = scanner.nextLine();
            System.out.println(starCollected);
        }

    }

    private static int[] readPosition(String command) {
        return Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}
