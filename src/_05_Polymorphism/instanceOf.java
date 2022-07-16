package _05_Polymorphism;

import _04_InterfacesAndAbstraction._02_CarShopExtend_lab.Audi;
import _04_InterfacesAndAbstraction._02_CarShopExtend_lab.Car;
import _04_InterfacesAndAbstraction._02_CarShopExtend_lab.Seat;

public class instanceOf {
    public static void main(String[] args) {

        Car car = new Seat("Seat", "blue", 200, "Spain", 23.535);

        example(car);
        example(new Audi("A7", "white", 400, "Germany", 5, 234D));


    }


    public static void example(Car car) {

        /* метода очаква тип Car. Дори горе да е инициализирано като Seat car = new Seat, в метода ще имаме достъп само
        методите в Car. За да вземем метода getPrice(), който го има имплементиран в Seat кастваме car към Seat.*/

        if (car instanceof Seat) {
            Seat seat = (Seat) car;
            System.out.println("The car is Seat. Its price is " + seat.getPrice());

        } else if(car.getClass() == Audi.class) { // друг начин за проверка на типа, на car.
            Audi audi = (Audi) car;
            System.out.println("The car is Audi. Its price pre day is " + audi.getPricePerDay());
        }
    }
}
