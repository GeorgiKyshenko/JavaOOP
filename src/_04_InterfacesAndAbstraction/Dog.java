package _04_InterfacesAndAbstraction;

public class Dog implements Animal{

    @Override
    public void eat() {
        System.out.println("Dog is eating...!");
    }
}
