package _06_S.O.L.I.D_excs;

import _06_S.O.L.I.D_excs.products.Chips;
import _06_S.O.L.I.D_excs.products.Chocolate;
import _06_S.O.L.I.D_excs.products.Coke;
import _06_S.O.L.I.D_excs.products.Lemonade;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Products> products = List.of(new Chips(358), new Chocolate(243.5), new Coke(2537.1), new Lemonade(3543.7));

        CalorieCalculator calculator = new CalorieCalculator();

        calculator.print("Sum %.2f", calculator.sum(products));
        System.out.println();
        calculator.print("Average %.2f", calculator.average(products));
    }
}
