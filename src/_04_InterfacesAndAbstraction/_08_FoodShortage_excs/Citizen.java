package _04_InterfacesAndAbstraction._08_FoodShortage_excs;

import _04_InterfacesAndAbstraction._07_BirthDayCelebration_excs.Birthable;

public class Citizen implements Person, Identifiable, Birthable, Buyer {

    private String name;
    private int age;
    private String id;
    private String birthDay;
    private int food;

    public Citizen(String name, int age, String id, String birthDay) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDay = birthDay;
        this.food = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getBirthDay() {
        return birthDay;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void buyFood() {
        food += 10;
    }

    @Override
    public int getFood() {
        return food;
    }
}
