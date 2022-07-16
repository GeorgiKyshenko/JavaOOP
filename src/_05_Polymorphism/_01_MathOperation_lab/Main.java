package _05_Polymorphism._01_MathOperation_lab;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        MathOperation math = new MathOperation();

        System.out.println(math.add(2, 2));
        System.out.println(math.add(3, 3, 3));
        System.out.println(math.add(4, 4, 4, 4));

        /*пример за статичен полиморфизъм с methods overloading*/
    }
}
