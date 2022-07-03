package _02_Encapsulation._01_SortByNameAndAge_lab;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %.2f leva", firstName, lastName, salary);
    }

    public void increaseSalary(double bonus) {
        if (age > 30) {
            salary = salary + salary * bonus / 100;
        } else {
            salary = salary + salary * bonus / 100 / 2;
        }
    }
}
