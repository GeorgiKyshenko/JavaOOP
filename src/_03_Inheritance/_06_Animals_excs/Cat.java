package _03_Inheritance._06_Animals_excs;

public class Cat extends Animal {

    public Cat(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    protected String produceSound() {
        return "Meow meow";
    }
}
