package _03_Inheritance;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog(10,20);

        dog.eat();
        dog.bark();

        Puppy puppy = new Puppy(2,10);

        puppy.eat();
        puppy.bark();
        puppy.weep();

        System.out.println(puppy.getPuppyAge());
        System.out.println(dog.getDogAge());



        /*Пример за чупене на енкапсулация -> в класа Animal, полето speed e равно на 20.
        * След като създадем setter за private field се нарушава принципа, защото можем да сетнем стойността
        * на speed отвън animal.setSpeed(40)*/

        Animal animal = new Animal(23,50);
        animal.setSpeed(40);
        System.out.println(animal.getSpeed());

    }
}
