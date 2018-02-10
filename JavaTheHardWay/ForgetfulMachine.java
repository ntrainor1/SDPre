import java.util.Scanner;

public class ForgetfulMachine {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("what city is the capital of France?");
    keyboard.next();

    System.out.println("What is 6 multiplied by 7?");
    keyboard.nextInt();
    //This question will blow up if you type in a decimal number.

    System.out.println("Enter a number between 0.0 and 1.0.");
    keyboard.nextInt();
    //This question will blow up if you type in a decimal number.

    System.out.println("Is there anything else you would like to do?");
    keyboard.nextDouble();
    //This question will blow up if you type in something other than a number.

  }
}
