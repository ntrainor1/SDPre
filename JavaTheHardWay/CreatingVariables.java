public class CreatingVariables {
  public static void main(String[] args) {
    int x, y, age;
    double seconds, e, checking;
    String firstName, lastName, title, hometown, state;

    x = 10;
    y = 400;
    age = 39;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;

    firstName = "Nate";
    lastName = "Trainor";
    title = "Mr.";

    hometown = "Denver";
    state = "Colorado";

    System.out.println("The variable x contains " + x);
    System.out.println("The value " + y + " is stored in the variable y.");
    System.out.println("The experiment took " + seconds + " seconds.");
    System.out.println("A favorite irrational number is Euler's Number: " + e);
    System.out.println("Hopefully, you have more than $" + checking + "!");
    System.out.println("My name is " + title + " " + firstName + " " + lastName);
    System.out.println("I live in " + hometown + ", " + state + ".");
  }
}
