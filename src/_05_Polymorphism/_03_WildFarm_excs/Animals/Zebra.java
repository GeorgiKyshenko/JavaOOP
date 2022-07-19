package _05_Polymorphism._03_WildFarm_excs.Animals;

import _05_Polymorphism._03_WildFarm_excs.Animal;
import _05_Polymorphism._03_WildFarm_excs.Food;
import _05_Polymorphism._03_WildFarm_excs.Mammal;

public class Zebra extends Mammal {

    public Zebra(String animalName, Double animalWeight, String livingRegion) {
        super(animalName, "Zebra", animalWeight, livingRegion);
    }

    @Override
    protected void makeSound() {

    }

    @Override
    protected void eat(Food foodType) {

    }
}
