package _05_Polymorphism._03_WildFarm_excs.Animals;

import _05_Polymorphism._03_WildFarm_excs.Feline;
import _05_Polymorphism._03_WildFarm_excs.Food;

public class Cat extends Feline {

    private String breed;

    public Cat(String animalName, Double animalWeight, String livingRegion, String breed) {
        super(animalName, "Cat", animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    protected void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    protected void eat(Food foodType) {
        setFoodEaten(getFoodEaten() + foodType.getQuantity());
    }

    @Override
    public String toString() {
        return String.format("%s[%s, %s, %s, %s, %d]",
                getAnimalType(),
                getAnimalName(),
                breed,
                getDf().format(getAnimalWeight()),
                getLivingRegion(),
                getFoodEaten());
    }
}
