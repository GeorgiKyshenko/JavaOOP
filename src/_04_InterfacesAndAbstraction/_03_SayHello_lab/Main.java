package _04_InterfacesAndAbstraction._03_SayHello_lab;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();


        persons.add(new Bulgarian("Peter"));
        persons.add(new European("Georgi"));
        persons.add(new Chinese("Ivan"));

        for (Person person : persons) {
            print(person);
            System.out.println(person.getName());
        }
    }

    private static void print(Person person) {
        System.out.println(person.sayHello());
    }
}
