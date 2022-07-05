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
    }
}
