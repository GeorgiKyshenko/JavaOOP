package _04_InterfacesAndAbstraction;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal cat = new Cat();

        feedTheAnimal(dog);
        feedTheAnimal(cat);
    }

    private static void feedTheAnimal(Animal animal) {
        animal.eat();
    }
}
