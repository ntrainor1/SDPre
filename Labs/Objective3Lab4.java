import java.util.Scanner;

public class Objective3Lab4 {
  public static void main(String[] args) {
    String firstName;
    String lastName;
    int age;

    Scanner input = new Scanner(System.in);

    System.out.println("Hello, what is your first name?");
    firstName = input.next();

    System.out.println("Cool, what is your last name?");
    lastName = input.next();

    System.out.println("Okay, last question: what is your age?");
    age = input.nextInt();

    System.out.println("Name: " + firstName + " " + lastName + ", Age: " + age);

    input.close();
  }
}
