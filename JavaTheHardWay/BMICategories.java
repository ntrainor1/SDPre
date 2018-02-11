import java.util.Scanner;

public class BMICategories {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double height, weight, bmi;

    System.out.print("Enter your height in m: ");
    height = keyboard.nextDouble();

    System.out.print("Enter your weight in kg: ");
    weight = keyboard.nextDouble();

    bmi = (weight/(height*height));

    System.out.println("Your BMI is " + bmi);
    System.out.print("BMI Category: ");
    if (bmi < 15.0) {
      System.out.println("severely underweight");
    }
    else if (bmi < 16.0) {
      System.out.println("very underweight");
    }
    else if (bmi < 18.5) {
      System.out.println("underweight");
    }
    else if (bmi < 25.0) {
      System.out.println("moderate weight");
    }
    else if (bmi < 30.0) {
      System.out.println("overweight");
    }
    else if (bmi < 35.0) {
      System.out.println("very overweight");
    }
    else if (bmi < 40.0) {
      System.out.println("severely overweight");
    }
    else {
      System.out.println("\"morbidly\" obese");
    }
  }
}
