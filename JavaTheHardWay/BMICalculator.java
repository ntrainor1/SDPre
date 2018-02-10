import java.util.Scanner;

public class BMICalculator {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double ft, in, lb, bmi;

    System.out.print("Your height in ft.: ");
    ft = keyboard.nextDouble();

    System.out.print("Your height in in.: ");
    in = keyboard.nextDouble();

    System.out.print("Your weight in lb.: ");
    lb = keyboard.nextDouble();

    bmi = lb/((ft + (in)/12)*(ft + (in)/12));

    System.out.println("Your BMI is " + bmi);
  }
}
