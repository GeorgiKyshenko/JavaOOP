package _04_InterfacesAndAbstraction._04_BorderControl_lab;

public class Citizen extends IdentifiableImpl {

    private String name;
    private int age;

    public Citizen(String id, int age, String name) {
        super(id);
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
