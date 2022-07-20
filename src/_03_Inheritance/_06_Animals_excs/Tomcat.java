package _03_Inheritance._06_Animals_excs;

public class Tomcat extends Cat {

    private static final String GENDER = "Male";

    public Tomcat(String name, int age) {
        super(name, age, GENDER);
    }

    @Override
    public String produceSound() {
        return "MEOW";
    }

    @Override
    public String getGender() {
        return GENDER;
    }
}
