package _06_S.O.L.I.D_excs;

public abstract class Food {

    protected final double grams;

    protected Food(double grams) {
        this.grams = grams;
    }

    public double getGrams() {
        return this.grams;
    }

    double getFoodAmountInKg() {
        return 1000 / this.getGrams();
    }
}

