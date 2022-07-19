package _06_S.O.L.I.D_excs.products;

import _06_S.O.L.I.D_excs.Drink;
import _06_S.O.L.I.D_excs.Products;

public class Lemonade extends Drink implements Products {

    public static final double CALORIES_PER_100_GRAMS = 53.0;
    public static final double DENSITY = 0.7;

    public Lemonade(double milliliters) {
        super(DENSITY, milliliters);
    }

    @Override
    public double getAmountOfCalories() {
        return (CALORIES_PER_100_GRAMS / 100) * super.getMilliliters() * DENSITY;
    }

}
