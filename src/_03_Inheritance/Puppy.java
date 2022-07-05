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
}
