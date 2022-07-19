package _06_S.O.L.I.D_excs.products;

import _06_S.O.L.I.D_excs.Food;
import _06_S.O.L.I.D_excs.Products;

public class Chocolate extends Food implements Products {

    public static final double CALORIES_PER_100_GRAMS = 575.0;

    public Chocolate(double grams) {
        super(grams);
    }

    public double getGrams() {
        return super.grams;
    }

    @Override
    public double getAmountOfCalories() {
        return (CALORIES_PER_100_GRAMS / 100) * super.getGrams();
    }


}
