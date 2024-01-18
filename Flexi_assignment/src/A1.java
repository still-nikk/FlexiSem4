package Flexi_assignment.src;

class Person {
    // Class variable
    private static int totalPeople = 0;

    // Instance variables
    private String name;
    private int age;
    private String occupation;

    // Constructor
    public Person(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;

        // Update class variable
        totalPeople++;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Occupation: " + occupation);
        System.out.println();
    }

    // Method to get total people
    public static int getTotalPeople() {
        return totalPeople;
    }
}

public class A1
{
    public static void main(String[] args) {
        // Creating instances of the Person class
        Person person1 = new Person("Alice", 28, "Software Engineer");
        Person person2 = new Person("Bob", 35, "Data Scientist");
        Person person3 = new Person("Charlie", 22, "Student");

        // Printing details of each person
        System.out.println("Details of Person 1:");
        person1.displayDetails();

        System.out.println("Details of Person 2:");
        person2.displayDetails();

        System.out.println("Details of Person 3:");
        person3.displayDetails();

        // Displaying the total number of people
        System.out.println("Total People: " + Person.getTotalPeople());
    }
}
