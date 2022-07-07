package _03_Inheritance;

public class Puppy extends Dog{

    public void weep() {
        System.out.println("weeping...");
    }

    public Puppy(int age, int weight) {
        super(age, weight);
    }

    public int getPuppyAge() {
        return super.age;
    }

    @Override
    public void eat() {
        System.out.print("The puppy is ");
        super.eat();

        /*чрез супер можем да викаме и методи от друг клас за да няма повтаряне на код*/
    }
}
