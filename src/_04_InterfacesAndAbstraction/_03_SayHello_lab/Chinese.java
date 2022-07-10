package _04_InterfacesAndAbstraction._03_SayHello_lab;

public class Chinese implements Person {

    private String name;

    public Chinese(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}
