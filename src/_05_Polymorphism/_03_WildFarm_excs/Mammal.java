package _05_Polymorphism._03_WildFarm_excs;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {

    private String livingRegion;

    public Mammal(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }

    private DecimalFormat df = new DecimalFormat("#.##");

    @Override
    public String toString() {
        return String.format("%s[%s, %s, %s, %d]",
                getAnimalType(),
                getAnimalName(),
                df.format(getAnimalWeight()),
                livingRegion,
                getFoodEaten());
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    public DecimalFormat getDf() {
        return df;
    }
}
