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

//    @Override
//    public void eat() {
//        System.out.print("The dog is ");
//        super.eat();
//
//        /*чрез супер можем да викаме и методи от друг клас за да няма повтаряне на код*/
//    }
}
