import java.util.Scanner;

public class RudeQuestions {
  public static void main(String[] args) {
    String name;
    int age;
    double weight, height, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Hello. What is your name?");
    name = keyboard.next();
    //This question will not actually explode if you plug in a number instead.

    System.out.print("Hi, " + name + "! How old are you?");
    age = keyboard.nextInt();

    System.out.println("You're " + age + " years old!? Not a bad age.");
    System.out.print("How much do you weigh, " + name + "?");
    weight = keyboard.nextDouble();
    //This question will not blow up if you plug in an integer instead.

    System.out.println(weight + "! Better keep that quiet!");
    System.out.print("What's your height, " + name + "?");
    height = keyboard.nextDouble();

    System.out.println(height + "! I don't think that's the proper height you should be!");
    System.out.print("Finally, what's your income, " + name + "?");
    income = keyboard.nextDouble();

    System.out.print("Hopefully, that is " + income + " per hour");
    System.out.println(" and not per year!");
    System.out.print("Well, thank you for answering my rude questions, ");
    System.out.println(name + ".");
    //If you try dividing your answer with spaces, (e.g. Nate Trainor), it will cause the program to explode, since it cannot compute spaces.
  }
}
