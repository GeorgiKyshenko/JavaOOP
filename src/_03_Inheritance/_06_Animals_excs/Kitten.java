package _03_Inheritance._06_Animals_excs;

public class Kitten extends Cat{

    private static final String GENDER = "Female";

    public Kitten(String name, int age) {
        super(name, age, GENDER);
    }

    @Override
    public String produceSound() {
        return "Meow";
    }

    @Override
    public String getGender() {
        return GENDER;
    }
}

