package _03_Inheritance;

public class Dog extends Animal {

    public void bark() {
        System.out.println("barking...");
    }


    public Dog(int age, int weight) {
        super(age, weight);
    }

    public int getDogAge() {
        return super.age;
    }
}
