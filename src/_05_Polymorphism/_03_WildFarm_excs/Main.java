package _05_Polymorphism._03_WildFarm_excs;

import _05_Polymorphism._03_WildFarm_excs.Animals.Cat;
import _05_Polymorphism._03_WildFarm_excs.Animals.Mouse;
import _05_Polymorphism._03_WildFarm_excs.Animals.Tiger;
import _05_Polymorphism._03_WildFarm_excs.Animals.Zebra;
import _05_Polymorphism._03_WildFarm_excs.Foods.Meat;
import _05_Polymorphism._03_WildFarm_excs.Foods.Vegetable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Animal> animals = new ArrayList<>();
        List<Food> foods = new ArrayList<>();

        String input = scanner.nextLine();
        int counter = 1;

        while (!input.equals("End")) {
            if (counter % 2 != 0) {
                String[] animalInput = input.split("\\s+");
                String animal = animalInput[0];

                switch (animal) {
                    case "Cat":
                        Animal cat = new Cat(animalInput[1], Double.parseDouble(animalInput[2]), animalInput[3], animalInput[4]);
                        animals.add(cat);
                        break;
                    case "Tiger":
                        Animal tiger = new Tiger(animalInput[1], Double.parseDouble(animalInput[2]), animalInput[3]);
                        animals.add(tiger);
                        break;
                    case "Mouse":
                        Animal mouse = new Mouse(animalInput[1], Double.parseDouble(animalInput[2]), animalInput[3]);
                        animals.add(mouse);
                        break;
                    case "Zebra":
                        Animal zebra = new Zebra(animalInput[1], Double.parseDouble(animalInput[2]), animalInput[3]);
                        animals.add(zebra);
                        break;
                }
            } else {

                String[] foodInput = input.split("\\s+");
                String food = foodInput[0];

                switch (food) {
                    case "Vegetable":
                        Food vegetable = new Vegetable(Integer.parseInt(foodInput[1]));
                        foods.add(vegetable);
                        break;
                    case "Meat":
                        Food meat = new Meat(Integer.parseInt(foodInput[1]));
                        foods.add(meat);
                        break;
                }
            }
            counter++;
            input = scanner.nextLine();
        }

        for (int i = 0; i < animals.size(); i++) {
            Animal animal = animals.get(i);
            Food food = foods.get(i);

            animal.makeSound();
            animal.eat(food);
        }

        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }
    }
}
