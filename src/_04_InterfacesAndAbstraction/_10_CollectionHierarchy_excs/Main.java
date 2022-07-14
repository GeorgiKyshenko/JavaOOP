package _04_InterfacesAndAbstraction._10_CollectionHierarchy_excs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AddCollection addCollection = new AddCollection();
        AddRemoveCollection addRemoveCollection = new AddRemoveCollection();
        MyListImpl myList = new MyListImpl();

        String[] input = scanner.nextLine().split("\\s+");
        int removeCount = Integer.parseInt(scanner.nextLine());


        printAdd(input, addCollection);
        printAdd(input, addRemoveCollection);
        printAdd(input, myList);

        printRemove(removeCount, addRemoveCollection);
        printRemove(removeCount,myList);
    }

    private static void printRemove(int removeCount, AddRemovable collection) {
        for (int i = 0; i < removeCount; i++) {
            System.out.print(collection.remove() + " ");
        }
        System.out.println();
    }

    private static void printAdd(String[] input, Addable collection) {
        for (String element : input) {
            System.out.print(collection.add(element) + " ");
        }
        System.out.println();
    }

}
