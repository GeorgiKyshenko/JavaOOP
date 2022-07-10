public class Main {
    public static void main(String[] args) {
        int i = 123;

        printMe(i);
    }
    static void printMe(Integer i) {
        System.out.println("Integer");
    }
    static void printMe(double d) {
        System.out.println("double");
    }
}
