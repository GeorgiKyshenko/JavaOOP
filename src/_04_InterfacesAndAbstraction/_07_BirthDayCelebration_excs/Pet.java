package _04_InterfacesAndAbstraction._07_BirthDayCelebration_excs;

public class Pet implements Birthable {

    private String name;
    private String birthDay;

    public Pet(String name, String birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    @Override
    public String getBirthDay() {
        return birthDay;
    }

    public String getName() {
        return name;
    }
}
