import java.util.Scanner;

public class Objective3Lab5 {
  public static void main(String[] args) {

    double a, b, total;
    Scanner input = new Scanner(System.in);

    System.out.println("Give me a number");
    a = input.nextDouble();

    System.out.println("Give me another number");
    b = input.nextDouble();

    total = a+b;
    System.out.println(a + " + " + b + " = " + total);

    input.close();
  }
}
