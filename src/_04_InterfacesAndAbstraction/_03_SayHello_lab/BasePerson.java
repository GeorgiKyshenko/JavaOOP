package _04_InterfacesAndAbstraction._03_SayHello_lab;

public abstract class BasePerson implements Person{

   private String name;

    public BasePerson(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
