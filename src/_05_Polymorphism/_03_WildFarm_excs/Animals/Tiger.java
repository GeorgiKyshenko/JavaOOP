package _05_Polymorphism._03_WildFarm_excs.Animals;

import _05_Polymorphism._03_WildFarm_excs.Feline;
import _05_Polymorphism._03_WildFarm_excs.Food;

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

    }
}
