package _03_Inheritance._03_Zoo_excs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Bear bear = new Bear("Spike");
        Gorilla gorilla = new Gorilla("Mike");

        System.out.println(bear.getName());
        System.out.println(gorilla.getName());
    }
}
