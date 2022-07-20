package _03_Inheritance._04_Restaurant_excs;

import java.math.BigDecimal;

public class Salmon extends Food {

    private static final double SALMON_GRAMS = 22;

    public Salmon(String name, BigDecimal price) {
        super(name, price, SALMON_GRAMS);
    }
}
