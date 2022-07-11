package _04_InterfacesAndAbstraction._05_Ferrari;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String driverName = new Scanner(System.in).nextLine();

        Car ferrari = new Ferrari(driverName);

        System.out.println(ferrari);
    }
}
