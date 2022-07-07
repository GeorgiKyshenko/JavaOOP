package _03_Inheritance._01_RandomArrayList_lab;

public class Main {
    public static void main(String[] args) {

        RandomArrayList list = new RandomArrayList();
        list.add(10);
        list.add(12);
        list.add(17);
        list.add(23);
        list.add(32);

        System.out.println(list.getRandomElement());
    }
}
