package _05_Polymorphism._03_WildFarm_excs.Animals;

import _05_Polymorphism._03_WildFarm_excs.Feline;
import _05_Polymorphism._03_WildFarm_excs.Food;
import _05_Polymorphism._03_WildFarm_excs.Foods.Meat;

public class Tiger extends Feline {

    public Tiger(String animalName, Double animalWeight, String livingRegion) {
        super(animalName, "Tiger", animalWeight, livingRegion);
    }

    @Override
    protected void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    protected void eat(Food foodType) {
        if (foodType instanceof Meat) {
            setFoodEaten(getFoodEaten() + foodType.getQuantity());
        } else {
            System.out.println("Tigers are not eating that type of food!");
        }
    }
}
