import java.util.Scanner;

public class SecretWord {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String secret = "please", mongoose = "super", guess;

    System.out.print("What's the magic word?");
    guess = keyboard.next();

    if ( guess.equals(secret) || guess.equals(mongoose) ) {
      System.out.println("That's correct!");
    }
    else {
      System.out.println("No, the secret word isn't \"" + guess + "\".");
    }

    if (guess == secret) {
      System.out.println("(This will never ever show, no matter what.)");
    }
  }
}