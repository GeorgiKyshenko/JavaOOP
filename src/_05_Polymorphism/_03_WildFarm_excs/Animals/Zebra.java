package _05_Polymorphism._03_WildFarm_excs.Animals;

import _05_Polymorphism._03_WildFarm_excs.Animal;
import _05_Polymorphism._03_WildFarm_excs.Food;
import _05_Polymorphism._03_WildFarm_excs.Foods.Vegetable;
import _05_Polymorphism._03_WildFarm_excs.Mammal;

public class Zebra extends Mammal {

    public Zebra(String animalName, Double animalWeight, String livingRegion) {
        super(animalName, "Zebra", animalWeight, livingRegion);
    }

    @Override
    protected void makeSound() {
        System.out.println("Zs");
    }

    @Override
    protected void eat(Food foodType) {
        if (foodType instanceof Vegetable) {
            setFoodEaten(getFoodEaten() + foodType.getQuantity());
        } else {
            System.out.println("Zebras are not eating that type of food!");
        }
    }
}
