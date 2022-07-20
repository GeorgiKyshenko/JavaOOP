package _03_Inheritance._06_Animals_excs;

public class Dog extends Animal {

    public Dog(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    protected String produceSound() {
        return "Woof!";
    }
}
