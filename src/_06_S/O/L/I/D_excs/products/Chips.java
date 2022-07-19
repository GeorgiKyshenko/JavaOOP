package _06_S.O.L.I.D_excs.products;

import _06_S.O.L.I.D_excs.Food;
import _06_S.O.L.I.D_excs.Products;

public class Chips extends Food implements Products {
    public static final double CALORIES_PER_100_GRAMS = 529.0;

    public Chips(double grams) {
        super(grams);
    }

    @Override
    public double getAmountOfCalories() {
        return (CALORIES_PER_100_GRAMS / 100) * super.getGrams();
    }

}
