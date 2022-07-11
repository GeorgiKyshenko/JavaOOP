package _04_InterfacesAndAbstraction._03_SayHello_lab;

public class Chinese extends BasePerson {


    public Chinese(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}
