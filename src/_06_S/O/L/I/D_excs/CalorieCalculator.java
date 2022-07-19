package _06_S.O.L.I.D_excs;

import java.util.List;

public class CalorieCalculator {

    private final Printer printer;
    private static final String SUM_FORMAT = "Sum: %.2f ";
    private static final String AVERAGE_FORMAT = "Average: %.2f ";

    public CalorieCalculator() {
        this.printer = new Printer();
    }


    public double sum(List<Products> products) {
        return products.stream()
                .mapToDouble(Products::getAmountOfCalories)
                .sum();

//        print(SUM_FORMAT, sum);
    }

    public double average(List<Products> products) {
        return sum(products) / products.size();

//        print(AVERAGE_FORMAT, average);
    }

    public void print(String format, double amount) {
        this.printer.print(format, amount);
    }
}
