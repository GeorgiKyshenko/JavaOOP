package _05_Polymorphism._02_Vehicles_excs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] carInput = scanner.nextLine().split("\\s+");
        Car car = new Car(Double.parseDouble(carInput[1]), Double.parseDouble(carInput[2]));

        String[] truckInput = scanner.nextLine().split("\\s+");
        Truck truck = new Truck(Double.parseDouble(truckInput[1]), Double.parseDouble(truckInput[2]));

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfCommands; i++) {

            String[] commandParts = scanner.nextLine().split("\\s+");
            String command = commandParts[0];
            String vehicleType = commandParts[1];
            double number = Double.parseDouble(commandParts[2]);

            switch (command) {
                case "Drive":
                    if (vehicleType.equals("Car")) {
                        System.out.println(car.drive(number));
                    } else if (vehicleType.equals("Truck")) {
                        System.out.println(truck.drive(number));
                    }
                    break;
                case "Refuel":
                    if (vehicleType.equals("Car")) {
                        car.refuel(number);
                    } else if (vehicleType.equals("Truck")) {
                        truck.refuel(number);
                    }
            }
        }
        System.out.printf("Car: %.2f%n",car.getFuelQuantity());
        System.out.printf("Truck: %.2f",truck.getFuelQuantity());
    }
}
