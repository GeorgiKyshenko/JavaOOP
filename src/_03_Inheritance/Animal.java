package _03_Inheritance;

public class Animal {
   public void eat() {
       System.out.println("eating....");
   }

   protected int age;
   protected int weight;

    public Animal(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }
}
