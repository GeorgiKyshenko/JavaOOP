package _03_Inheritance._06_Animals_excs;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String animalType = scanner.nextLine();

        Map<String, Animal> animals = new LinkedHashMap<>();

        while (!animalType.equals("Beast!")) {

            String[] animalInfo = scanner.nextLine().split("\\s+");
            String name = animalInfo[0];
            int age = Integer.parseInt(animalInfo[1]);
            String gender = animalInfo[2];

            try {
                switch (animalType) {
                    case "Dog":
                        Dog dog = new Dog(name, age, gender);
                        animals.put("Dog", dog);
                        break;
                    case "Cat":
                        Cat cat = new Cat(name, age, gender);
                        animals.put("Cat", cat);
                        break;
                    case "Frog":
                        Frog frog = new Frog(name, age, gender);
                        animals.put("Frog", frog);
                        break;
                    case "Kitten":
                        Kitten kitten = new Kitten(name, age);
                        animals.put("Kitten", kitten);
                        break;
                    case "Tomcat":
                        Tomcat tomcat = new Tomcat(name, age);
                        animals.put("Tomcat", tomcat);
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            animalType = scanner.nextLine();
        }
        animals.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v);
            System.out.println(v.produceSound());
        });
    }
}
