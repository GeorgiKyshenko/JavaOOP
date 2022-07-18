package S.O.L.I.D_excs;

import S.O.L.I.D_excs.products.Chocolate;
import S.O.L.I.D_excs.products.Coke;
import S.O.L.I.D_excs.products.Lemonade;

import java.util.List;

public class CalorieCalculator {


    private final Printer printer;
    private static final String SUM_FORMAT = "Sum: %f";
    private static final String AVERAGE_FORMAT = "Average: %f";

    public CalorieCalculator() {
        this.printer = new Printer();
    }


    public double sum(List<Products> products) {

        final double sum = products.stream()
                .mapToDouble(Products::getAmountOfCalories)
                .sum();

        print(SUM_FORMAT, sum);

        return sum;
    }

    public double average(List<Products> products) {
        final double average = sum(products) / products.size();
        print(AVERAGE_FORMAT, average);
        return average;
    }

    public void print(String format, double amount) {
        this.printer.print(format, amount);
    }
}
